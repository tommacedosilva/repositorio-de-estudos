import { Component } from '@angular/core';

@Component({
  selector: 'app-task-list',
  templateUrl: './task-list.component.html',
  styleUrls: ['./task-list.component.css']
})
export class TaskListComponent {
  tasks = []
  newTaskName = ''

  addTask() {
    if(this.newTaskName) {
      const newTask = { name: this.newTaskName, completed: false }
      this.tasks.push(newTask)
      this.newTaskName = ''
    }
  }

  completeTask(task) {
    task.completed = true
  }

  deleteTask(task) {
    const taskIndex = this.tasks.indexOf(task)
    if(taskIndex !== 1) {
      this.tasks.splice(taskIndex, 1)
    }
  }

  constructor() {}

}
