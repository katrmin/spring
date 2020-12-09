package ru.geekbrains.servlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.geekbrains.model.Product;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class FirstServlet extends HttpServlet {
    private static Logger logger = LoggerFactory.getLogger(FirstServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setHeader("Content-Type", "text/html; charset=utf-8");
        resp.getWriter().println("<h1>Get request of product list: </h1>");
        List<Product> products = Arrays.asList(new Product(1L,"Product 1", "Description of Product 1"),
                new Product(1L,"Product 1", "Description of Product 1"),
                new Product(2L,"Product 2", "Description of Product 2"),
                new Product(3L,"Product 3", "Description of Product 3"),
                new Product(4L,"Product 4", "Description of Product 4"),
                new Product(5L,"Product 5", "Description of Product 5"),
                new Product(6L,"Product 6", "Description of Product 6"),
                new Product(7L,"Product 7", "Description of Product 7"),
                new Product(8L,"Product 8", "Description of Product 8"),
                new Product(9L,"Product 9", "Description of Product 9"),
                new Product(10L,"Product 10", "Description of Product 10")
        );
        StringBuilder sb = new StringBuilder();
        products.forEach(product -> sb.append(product));
        resp.getWriter().println(sb.toString());
    }
}
