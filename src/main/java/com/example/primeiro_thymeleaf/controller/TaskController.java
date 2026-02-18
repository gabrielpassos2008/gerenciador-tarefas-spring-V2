package com.example.primeiro_thymeleaf.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.primeiro_thymeleaf.model.Task;

// Indica que essa classe é um controller
@Controller
public class TaskController {

    // Lista que armazena as tarefas em memória (simulando um banco de dados)
    List<Task> tasks = new ArrayList<>();

    // Mapeia a rota principal "/"
    @GetMapping("/")
    public String home() {
        // Retorna a página home.html
        return "home";
    }

    // Rota GET para abrir a página de criação
    @GetMapping("/create")
    public ModelAndView getCreate() {
        // Cria um ModelAndView apontando para a página create.html
        ModelAndView mv = new ModelAndView("create");

        // Envia um objeto Task vazio para o formulário
        // Isso é necessário para o Thymeleaf conseguir fazer o binding
        mv.addObject("task", new Task());

        return mv;
    }

    // Rota POST para salvar a tarefa (criar ou editar)
    @PostMapping("/create")
    public String postCreate(Task task) {

        // Se o ID não for nulo, significa que estamos EDITANDO
        if (task.getId() != null) {

            // Procura na lista a tarefa com o mesmo ID
            Task taskFind = tasks.stream()
                    .filter(taskItem -> task.getId().equals(taskItem.getId()))
                    .findFirst()
                    .get();

            // Substitui a tarefa antiga pela nova versão editada
            tasks.set(tasks.indexOf(taskFind), task);

        } else {

            // Se o ID for nulo, significa que estamos CRIANDO uma nova tarefa

            // Gera um ID automático baseado no tamanho da lista
            Long id = tasks.size() + 1L;

            // Cria uma nova Task e adiciona na lista
            tasks.add(new Task(id, task.getName(), task.getDate()));
        }

        // Redireciona para a página de listagem
        return "redirect:/list";
    }

    // Rota GET para listar todas as tarefas
    @GetMapping("/list")
    public ModelAndView getList() {

        // Cria ModelAndView apontando para list.html
        ModelAndView mv = new ModelAndView("list");

        // Envia a lista de tarefas para a view
        mv.addObject("tasks", tasks);

        return mv;
    }

    // Rota GET para editar uma tarefa específica
    @GetMapping("/edit/{id}")
    public ModelAndView getEdit(@PathVariable("id") Long id) {

        // Reutiliza a página create.html para edição
        ModelAndView mv = new ModelAndView("create");

        // Procura a tarefa na lista pelo ID recebido na URL
        Task taskFind = tasks.stream()
                .filter(task -> id.equals(task.getId()))
                .findFirst()
                .get();

        // Envia a tarefa encontrada para o formulário (já preenchido)
        mv.addObject("task", taskFind);

        return mv;
    }

    @GetMapping("delete/{id}")
    public String getDeletar(@PathVariable("id") Long id) {
        tasks.removeIf(task -> task.getId().equals(id));
        return "redirect:/";
    }
}
