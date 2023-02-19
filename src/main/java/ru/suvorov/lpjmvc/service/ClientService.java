package ru.suvorov.lpjmvc.service;

import ru.suvorov.lpjmvc.model.Client;

import java.util.List;

public interface ClientService {
    /*
    * Создает клиента
    * @param client - клиент для создания
    * */
    void create(Client client);

    /*
    * Возращает список всех клиентов
    * @return список клиентов
    * */
    List<Client> readAll();

    /*
    * Возращает клиента по его ID
    * @param id - ID клиента
    * @return - объект клиента с заданным ID
    * */
    Client read(int id);

    /*
    * Меняет клиента с заданным ID,
    * в соответствии с переданным клиентом
    * @param client - клиент в соотвествии с которым нужно обновить данные
    * @param id - id клиента который нужно обновить
    * @return - true если данные были обновлены, иначе false
    * */
    boolean update(Client client, int id);

    /*
    * Удаляет клиента с заданным ID
    * @param id - id клиента, которого нужно удалить
    * @return - true если клиент удален, иначе false
    * */
    boolean delete(int id);
}
