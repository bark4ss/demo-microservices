package by.teachmeskills.example.forex.forexservice.service.impl;

import by.teachmeskills.example.forex.forexservice.model.ExchangeValue;
import by.teachmeskills.example.forex.forexservice.repository.ExchangeValueRepository;
import by.teachmeskills.example.forex.forexservice.service.ExchangeValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExchangeValueServiceImpl implements ExchangeValueService {

    private ExchangeValueRepository repository;

    @Autowired
    public ExchangeValueServiceImpl(ExchangeValueRepository repository) {
        this.repository = repository;
    }

    @Override
    public ExchangeValue findByFromAndTo(String from, String to) {
        return repository.findByFromAndTo(from, to);
    }
}
