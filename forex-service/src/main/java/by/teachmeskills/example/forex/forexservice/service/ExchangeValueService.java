package by.teachmeskills.example.forex.forexservice.service;

import by.teachmeskills.example.forex.forexservice.model.ExchangeValue;

public interface ExchangeValueService {

    ExchangeValue findByFromAndTo(String from, String to);
}
