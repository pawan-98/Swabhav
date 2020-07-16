package com.techlabs.model;

import java.net.MalformedURLException;

import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class OrganizationHeirarchyFrame extends JFrame {
	public OrganizationHeirarchyFrame() throws MalformedURLException {
		OrgHierarchyBuilder builder = new OrgHierarchyBuilder(new CsvFileLoader());
		builder.getData();
		Employee employee = builder.getCeo();
		DefaultMutableTreeNode ceo = new DefaultMutableTreeNode(employee.getName());
		generateHeirarchy(employee, ceo);
		JTree tree = new JTree(ceo);
		add(tree);
		this.setVisible(true);
		this.setSize(500, 500);
	}

	public void generateHeirarchy(Employee employee, DefaultMutableTreeNode folder) {

		for (Employee emp : employee.getEmployeesUnderThisEmployee()) {
			DefaultMutableTreeNode child = new DefaultMutableTreeNode(emp.getName());
			generateHeirarchy(emp, child);
			folder.add(child);
		}
	}
}
