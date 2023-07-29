---------------------------------------------------------------------------------------------------
                                    -- COMANDO COALESSE --
---------------------------------------------------------------------------------------------------
◉ Comando usado para subtituir valores NULL

 -- EXEMPLO PARA NUMEROS
    SELECT nome, COALESCE(salario_fixo, 0), COALESCE(bonus, 0), COALESCE(salario_fixo, 0) +
COALESCE(bonus, 0) AS Salario_Total FROM funcionario;

-- EXEMPLO PARA TEXTO
    SELECT nome, COALESCE(cargo, 'Desconhecido'), COALESCE(salario_fixo, 0),
COALESCE(bonus, 0), COALESCE(salario_fixo, 0)+COALESCE(bonus, 0) AS Salario_Total FROM
funcionario;
--------------------------------------------------------------------------------------------------- 
                                    -- COMANDO ARREDONDAMENTO --
--------------------------------------------------------------------------------------------------- 

-- CEILING (ARREDONDA PARA CIMA)
SELECT CEILING(15.85 + 1.07) – Resultado: 17

-- FLOOR (ARREDONDA PAR ABAIXO)
SELECT FLOOR( 15.85 + 1.07) – Resultado: 16

-- ROUND (ARREDONDA PARA O INTEIRO MAIS PROXIMO)
SELECT ROUND(-1.23); Resultado: -1
SELECT ROUND(-1.58); Resultado: -2
SELECT ROUND(1.58); Resultado:2
SELECT ROUND(1.298, 1); Resultado: 1.3
SELECT ROUND(1.298, 0); Resultado: 1

SELECT nome, salario_fixo, FORMAT((salario_fixo/30),2) AS 'Salário Diário' FROM funcionario;

--------------------------------------------------------------------------------------------------- 
                                    -- FUNÇÕES DE DATA --
--------------------------------------------------------------------------------------------------- 

-- RETORNA A DATA ATUAL DO SERVIDOR

CURDATE() ou CURENT_DATE();

-- FORMATAR A DATA 

DATE_FORMAT(<Data_para_Formatar>, <Formato_Desejado>)

SELECT DATE_FORMAT(CURDATE(), '%d/%m/%Y')

--------------------------------------------------------------------------------------------------- 
                                    -- FUNÇÕES DE HORARIO --
---------------------------------------------------------------------------------------------------
-- RETORNA O HORARIO ATUAL
SELECT CURTIME();


Funções de Manipulação de Strings

--------------------------------------------------------------------------------------------------- 
                                    -- MANIPULAÇÃO DE STRINGS --
---------------------------------------------------------------------------------------------------
-- RETORNA A CONCATENAÇÃO DE COLUNAS OU CARACTERES PASSADO COMO PARAMETRO

CONCAT()
SELECT CONCAT('My', 'S', 'QL');

= "MySQL"

--EXEMPLO 2 

SELECT CONCAT(nome, ' - Salário: ', salario_fixo) FROM funcionario WHERE
salario_fixo>2000;
