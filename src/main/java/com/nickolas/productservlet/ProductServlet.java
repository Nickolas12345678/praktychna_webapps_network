package com.nickolas.productservlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/products")
public class ProductServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Bread", 2.0));
        products.add(new Product(2, "Apple", 1.5));
        products.add(new Product(3, "Milk", 1.2));
        products.add(new Product(4, "Cheese", 3.0));
        products.add(new Product(5, "Chicken", 5.5));
        products.add(new Product(6, "Eggs", 3.5));
        products.add(new Product(7, "Orange", 2.0));
        products.add(new Product(8, "Rice", 1.0));
        products.add(new Product(9, "Pasta", 1.8));
        products.add(new Product(10, "Tomato", 0.9));

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>List of Products</h1>");
        out.println("<ul>");
        for (Product product : products) {
            out.println("<li>Id: " + product.getId() + ", Title: " + product.getTitle() + ", Cost: $" + product.getCost() + "</li>");
        }
        out.println("</ul>");
        out.println("</body></html>");
    }
}
