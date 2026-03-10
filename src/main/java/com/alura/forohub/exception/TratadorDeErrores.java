package com.alura.forohub;

@RestControllerAdvice
public class TratadorDeErrores {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity tratarError(RuntimeException ex){

        return ResponseEntity.badRequest().body(ex.getMessage());
    }
}