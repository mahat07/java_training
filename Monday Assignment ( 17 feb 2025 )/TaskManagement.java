package com.celcom.MondayAssignment;

import java.util.ArrayList;
import java.util.Scanner;

//creating a class for tasks
class Task {
	private String title;
	private boolean isDone;

	public Task(String title) {
		this.title = title;
		this.isDone = false;
	}

	public String getTitle() {
		return title;
	}

	public boolean isDone() {
		return isDone;
	}

	public void markAsDone() {
		this.isDone = true;
	}

	@Override
	public String toString() {
		return (isDone ? "[✓] " : "[ ] ") + title;
	}
}

//to manage tasks
class TaskManager {
	private final ArrayList<Task> tasks = new ArrayList<>();

	public void addTask(String title) {
		tasks.add(new Task(title));
	}

	public ArrayList<Task> getTasks() {
		return tasks;
	}

	public boolean markTaskCompleted(int index) {
		if (index >= 0 && index < tasks.size()) {
			tasks.get(index).markAsDone();
			return true;
		}
		return false;
	}

	public boolean deleteTask(int index) {
		if (index >= 0 && index < tasks.size()) {
			tasks.remove(index);
			return true;
		}
		return false;
	}

	public ArrayList<Task> searchTasks(String keyword) {
		ArrayList<Task> result = new ArrayList<>();
		for (Task task : tasks) {
			if (task.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
				result.add(task);
			}
		}
		return result;
	}
}

public class TaskManagement {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		TaskManager taskManager = new TaskManager();
		ArrayList<Task> tasks = taskManager.getTasks();

		while (true) {
			System.out.println("\nTask Management System:");
			System.out.println("1. Add Task");
			System.out.println("2. View Tasks");
			System.out.println("3. Mark Task as Completed");
			System.out.println("4. Delete Task");
			System.out.println("5. Search Task");
			System.out.println("Press any other key to exit..");
			System.out.print("Choose an option: ");
			int choice;
			try{
				choice = scanner.nextInt();
			} catch ( java.util.InputMismatchException e) {
				choice = 6;
			}
			
			scanner.nextLine(); // Consume newline

			switch (choice) {
			case 1 -> {
				System.out.print("Enter task title: ");
				String title = scanner.nextLine();
				taskManager.addTask(title);
				System.out.println("Task added successfully.");
			}
			case 2 -> {
				if (tasks.isEmpty()) {
					System.out.println("No tasks available.");
				} else {
					System.out.println("\nYour Tasks:");
					for (int i = 0; i < tasks.size(); i++) {
						System.out.println((i + 1) + ". " + tasks.get(i));
					}
				}
			}
			case 3 -> {
				System.out.println("Enter task number to mark as completed from Your Tasks:");
				for (int i = 0; i < tasks.size(); i++) {
					System.out.println((i + 1) + ". " + tasks.get(i));
				}
				int index = scanner.nextInt() - 1;
				if (taskManager.markTaskCompleted(index)) {
					System.out.println("Task marked as completed.");
				} else {
					System.out.println("Invalid task number.");
				}
			}
			case 4 -> {
				System.out.print("Enter task number to delete: from Your Tasks:");
				for (int i = 0; i < tasks.size(); i++) {
					System.out.println((i + 1) + ". " + tasks.get(i));
				}

				int index = scanner.nextInt() - 1;
				if (taskManager.deleteTask(index)) {
					System.out.println("Task deleted successfully.");
				} else {
					System.out.println("Invalid task number.");
				}
			}
			case 5 -> {
				System.out.print("Enter keyword to search: ");
				String keyword = scanner.nextLine();
				ArrayList<Task> foundTasks = taskManager.searchTasks(keyword);
				if (foundTasks.isEmpty()) {
					System.out.println("No tasks found with that keyword.");
				} else {
					System.out.println("\nMatching Tasks:");
					for (Task task : foundTasks) {
						System.out.println(task);
					}
				}
			}
			case 6 -> {
				System.out.println("Exiting... Goodbye!");
				scanner.close();
				return;
			}
			default -> System.out.println("Invalid option. Try again.");
			}
		}
	}
}
