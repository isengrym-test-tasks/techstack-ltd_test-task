package ua.klieshchunov.service;

import ua.klieshchunov.exception.ClientNotFoundException;
import ua.klieshchunov.exception.ComputerNotFoundException;
import ua.klieshchunov.exception.EntityAlreadyExistsException;
import ua.klieshchunov.exception.EntityIllegalArgumentException;
import ua.klieshchunov.model.entity.Client;
import ua.klieshchunov.model.entity.Order;

import java.util.List;

public interface OrderService {
    List<Order> findAllForClient(int clientId);
    List<Order> findAll();
    Order createOrder(int clientId, int productId)
            throws ComputerNotFoundException, ClientNotFoundException,
            EntityAlreadyExistsException, EntityIllegalArgumentException;
    void takePayment(Client client, int amount) throws EntityIllegalArgumentException;
}
