package by.teachmeskills.example.forex.forexservice.controller;

import by.teachmeskills.example.forex.forexservice.model.ExchangeValue;
import by.teachmeskills.example.forex.forexservice.service.ExchangeValueService;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ForexController {

    private Environment environment;

    private ExchangeValueService exchangeValueService;

    public ForexController(Environment environment, ExchangeValueService exchangeValueService) {
        this.environment = environment;
        this.exchangeValueService = exchangeValueService;
    }

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public ExchangeValue retrieveExchangeValue
            (@PathVariable String from, @PathVariable String to) {

        ExchangeValue exchangeValue =
                exchangeValueService.findByFromAndTo(from, to);

        exchangeValue.setPort(
                Integer.parseInt(environment.getProperty("local.server.port")));

        return exchangeValue;
    }
}
