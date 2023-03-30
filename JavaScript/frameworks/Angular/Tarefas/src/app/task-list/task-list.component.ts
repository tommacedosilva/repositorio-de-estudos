import { Component } from '@angular/core';

@Component({
  selector: 'app-task-list',
  templateUrl: './task-list.component.html',
  styleUrls: ['./task-list.component.css']
})
export class TaskListComponent {
  tasks = [
    { name: 'Estudo programação', completed: false },
    { name: 'Almoçar', completed: false },
    { name: 'Limpar areia', completed: false }
  ]

  addTask(newTask: { name: string; completed: boolean; }) {
    this.tasks.push(newTask)
  }

  removeTask(task: { name: string; completed: boolean; }) {
    const index = this.tasks.indexOf(task)
    if(index !== -1) {
      this.tasks.splice(index, 1)
    }
  }

  completeTask(task: { completed: boolean; }) {
    task.completed = true
  }

}
