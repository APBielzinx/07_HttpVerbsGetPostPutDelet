package br.com.erudio;

import br.com.erudio.exceptions.UnsuportedMathOperationException;
import br.com.erudio.functions.Calcs;
import br.com.erudio.functions.IsNumeric;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class PersonController {

    private static final String template = "Hellow, %s!";
    private static final AtomicLong counter = new AtomicLong();


    @RequestMapping(value = "/sum/{numberOne}/{numberTwo}",
            method = RequestMethod.GET)

    //soma
    public Double sum(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
            ) throws Exception{

            if (!isNumeric.isNumeric(numberOne) || !isNumeric.isNumeric(numberTwo)){
                throw new UnsuportedMathOperationException("Please set a numeric value");
            }







}
