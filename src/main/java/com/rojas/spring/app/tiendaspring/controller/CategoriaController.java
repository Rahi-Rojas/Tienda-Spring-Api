package com.rojas.spring.app.tiendaspring.controller;

import com.rojas.spring.app.tiendaspring.model.Categoria;
import com.rojas.spring.app.tiendaspring.service.CategoriaService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/categoria")
public class CategoriaController {

    private final CategoriaService categoriaService;

    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    @GetMapping
    public String mostrarCategoria(Model model) {
        model.addAttribute("categorias", categoriaService.listarCategoria());
        return "categoria/lista-categoria";
    }

    @PostMapping
    public String guardarCategoria(@Valid @ModelAttribute Categoria categoria, BindingResult result) {
        if (result.hasErrors()) {
            return  "categoria/formulario";
        }

        categoriaService.guardarCategoria(categoria);
        return "redirect:/categoria";
    }

    @GetMapping("/nuevo")
    public String nuevaCategoria(Model model) {
        model.addAttribute("categoria", new Categoria());
        return "categoria/formulario";
    }

    @GetMapping("/editar/{id}")
    public String editarCategoria(@PathVariable Long id, Model model) {
        categoriaService.buscarCategoriaPorId(id).ifPresent(categoria -> model.addAttribute("categoria", categoria));
        return "categoria/formulario";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarCategoria(@PathVariable Long id, RedirectAttributes attr) {
        categoriaService.eliminarCategoria(id);
        attr.addFlashAttribute("bien", "La Categoria se elimino con exito!");
        return "redirect:/categoria";
    }

}
