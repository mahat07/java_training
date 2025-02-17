package com.celcom.MondayAssignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Task {
	private String title;
	private boolean isDone;

	Task(String title) {
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

public class TaskManagement {
	private static final ArrayList<Task> tasks = new ArrayList<>();
	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			System.out.println("Choose your option");

			System.out.println(" 1.Add Task \n 2.view all tasks"
					+ " \n 3.Delete a task \n 4.Search for a task \n 5.Mark a task as completed" + "\n 6.Exit");
			int n = sc.nextInt();
			switch (n) {
			case 1 -> addTask();
			case 2 -> viewTasks();
			case 3 -> markAsDone();
			case 4 -> deleteTask();
			case 5 -> searchTask();
			case 6 -> {
				System.out.println("Exiting... Goodbye!");
				return;
			}
			default -> System.out.println("Invalid option. Try again.");
			}
		}
	}

	private static void addTask() {
		System.out.print("Enter task title: ");
		String title = sc.nextLine();
		tasks.add(new Task(title));
		System.out.println("Task added successfully.");
	}

	private static void viewTasks() {
		if (tasks.isEmpty()) {
			System.out.println("No tasks available.");
			return;
		}
		System.out.println("\nYour Tasks:");
		for (int i = 0; i < tasks.size(); i++) {
			System.out.println((i + 1) + ". " + tasks.get(i));
		}
	}

	private static void markAsDone() {
		viewTasks();
		if (tasks.isEmpty())
			return;

		System.out.print("Enter task number to mark as completed: ");
		int index = sc.nextInt() - 1;
		if (index >= 0 && index < tasks.size()) {
			tasks.get(index).markAsDone();
			System.out.println("Task marked as completed.");
		} else {
			System.out.println("Invalid task number.");
		}
	}

	private static void deleteTask() {
		viewTasks();
		if (tasks.isEmpty())
			return;

		System.out.print("Enter task number to delete: ");
		int index = sc.nextInt() - 1;
		if (index >= 0 && index < tasks.size()) {
			tasks.remove(index);
			System.out.println("Task deleted successfully.");
		} else {
			System.out.println("Invalid task number.");
		}
	}

	private static void searchTask() {
		System.out.print("Enter keyword to search: ");
		String keyword = sc.nextLine().toLowerCase();
		boolean found = false;

		for (Task task : tasks) {
			if (task.getTitle().toLowerCase().contains(keyword)) {
				System.out.println(task);
				found = true;
			}
		}
		if (!found)
			System.out.println("No tasks found with that keyword.");
	}

}
