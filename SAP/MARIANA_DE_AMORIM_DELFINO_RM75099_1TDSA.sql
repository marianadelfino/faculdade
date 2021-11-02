--- 1.)
DELETE FROM T_PS2_ALUNO
WHERE CD_ALUNO = 3; 
COMMIT ; 
--- NÃO FOI POSSÍVEL DELETAR O REGISTRO DEVIDO À RESTRIAÇÃO DE INTEGRIDADE. 
--- O ALUNO PARA CD_ALUNO = 3 (MANOEL PORTUGUES) POSSUI REGISTROS DE MATRÍCULA, EXAME MÉDICO E TÍTULO PAGO. 



--- 2.)
SELECT P.CD_PLANO                     "COD.PLANO", 
       P.DS_PLANO                     "PLANO", 
       P.VL_PLANO                     "PREÇO", 
       L.DS_MODALIDADE                "MODALIDADE", 
       T.DS_TIPO_MODALIDADE           "TIPO MODALIDADE"
FROM T_PS2_PLANO P INNER JOIN T_PS2_MODALIDADE_PLANO M
ON (P.CD_PLANO = M.CD_PLANO) 

INNER JOIN T_PS2_MODALIDADE L 
ON (M.CD_MODALIDADE = L.CD_MODALIDADE) 

INNER JOIN T_PS2_TIPO_MODALIDADE T
ON (L.CD_MODALIDADE = T.CD_MODALIDADE) 
ORDER BY P.DS_PLANO ASC;



--- 3.) 
SELECT M.NR_MATRICULA                           "NR. MATRÍCULA",
       A.NM_ALUNO                               "ALUNO",
       M.DT_MATRICULA                           "DT.MATRÍCULA", 
       M.NR_PLANO_PAGTO                         "TIPO PAGTO",
       I.DS_RAZAO_SOCIAL                        "INSTITUIÇÃO",
       P.CD_PLANO                               "COD.PLANO",
       P.DS_PLANO                               "PLANO",
       P.VL_PLANO                               "PREÇO"
FROM T_PS2_INSTITUICAO I INNER JOIN T_PS2_ALUNO A
ON (I.CD_INSTITUICAO = A.CD_INSTITUICAO)

INNER JOIN T_PS2_MATRICULA M
ON (A.CD_ALUNO = M.CD_ALUNO)

INNER JOIN T_PS2_PLANO P
ON (M.CD_PLANO = P.CD_PLANO) 
WHERE TO_CHAR(M.DT_MATRICULA, 'YYYY') >= 2013 
ORDER BY M.DT_MATRICULA ASC, A.NM_ALUNO ASC;



--- 4.)
SELECT A.CD_ALUNO              "COD.ALUNO",
       A.NM_ALUNO              "NOME",
       I.DS_RAZAO_SOCIAL       "INSTITUIÇÃO"
FROM T_PS2_ALUNO A LEFT OUTER JOIN T_PS2_INSTITUICAO I
ON (I.CD_INSTITUICAO = A.CD_INSTITUICAO)
WHERE I.CD_INSTITUICAO IS NULL;



--- 5.)
SELECT M.CD_MODALIDADE                   "COD.MODALIDADE",
       M.DS_MODALIDADE                   "MODALIDADE",
       T.DS_TIPO_MODALIDADE              "TIPO DE MODALIDADE",
       T.DT_INICIO                       "INÍCIO MODALIDADE",
       T.DT_TERMINO                      "TÉRMINO MODALIDADE"
FROM T_PS2_MODALIDADE M INNER JOIN T_PS2_TIPO_MODALIDADE T
ON (M.CD_MODALIDADE = T.CD_MODALIDADE) 
WHERE T.DT_TERMINO IS NULL 
ORDER BY M.DS_MODALIDADE ASC, T.DS_TIPO_MODALIDADE ASC; 



--- 6.)
SELECT P.DS_PLANO, 
       COUNT(M.CD_ALUNO)         "QTDE. ALUNOS"
FROM T_PS2_MATRICULA M INNER JOIN T_PS2_PLANO P
ON (M.CD_PLANO = P.CD_PLANO)
GROUP BY P.DS_PLANO
ORDER BY P.DS_PLANO ASC;



--- 7.) NÃO SEI A RESPOSTA 
SELECT ROWNUM "RANK", 
          "NR.MATRICULA",
              "ALUNO",
              "QTDE. MESES ATIVO"
FROM () 
WHERE ROWNUM <= 3 



SELECT M.NR_MATRICULA                                                         "NR.MATRICULA", 
       A.NM_ALUNO                                                             "ALUNO", 
       ((SYSDATE - M.DT_MATRICULA)/30)                    "QTDE. MESES ATIVO"
FROM T_PS2_ALUNO A INNER JOIN T_PS2_MATRICULA M 
ON (A.CD_ALUNO = M.CD_ALUNO) 
WHERE M.DT_DESLIGAMENTO IS NULL 


SELECT * FROM T_PS2_ALUNO ;
SELECT * FROM T_PS2_MATRICULA ;



--- 8.)
SELECT A.CD_ALUNO             "COD.ALUNO",
       A.NM_ALUNO             "ALUNO", 
       E.DT_AVALIACAO         "DATA AVALIAÇÃO",
       M.NM_MEDICO            "MÉDICO"
FROM T_PS2_ALUNO A INNER JOIN T_PS2_EXAME_MEDICO E
ON (A.CD_ALUNO = E.CD_ALUNO)

INNER JOIN T_PS2_MEDICO M
ON (E.CD_MEDICO = M.CD_MEDICO) 
WHERE E.DT_AVALIACAO >= TO_DATE('01/05/2014', 'DD/MM/YYYY')
ORDER BY A.NM_ALUNO ASC, E.DT_AVALIACAO DESC 



--- 9.)
SELECT M.NR_MATRICULA                                                                        "MATRPICULA",
       T.NR_BOLETO                                                                           "NR. BOLETO",
       T.DT_VENCIMENTO                                                                       "VENCIMENTO", 
       TO_CHAR(T.VL_DOCUMENTO, 'L9,999.99')                                                  "VALOR DO TÍTULO", 
       P.DT_PAGAMENTO                                                                        "DATA PAGTO",
       TO_CHAR(NVL((T.VL_DOCUMENTO * P.VL_PERC_JUROS)/100 + P.VL_PAGO, 0), 'L9,999.99')      "VALOR PAGO",
       TO_CHAR(NVL(P.VL_JUROS, 0), 'L9,999.99')                                               "JUROS" 
FROM T_PS2_MATRICULA M INNER JOIN T_PS2_TITULO T
ON (M.CD_ALUNO = T.CD_ALUNO)

INNER JOIN T_PS2_TITULO_PAGO P
ON (T.CD_ALUNO = P.CD_ALUNO) 
WHERE TO_CHAR(T.DT_VENCIMENTO, 'MM/YYYY') IN ('09/2014')  AND TO_CHAR(P.DT_PAGAMENTO, 'MM/YYYY') IN ('09/2014')  
ORDER BY T.DT_VENCIMENTO ASC, T.VL_DOCUMENTO ASC; 



--- 10.) NÃO SEI A RESPOSTA 
SELECT M.NR_MATRICULA                                                                        "MATRPICULA",
       T.NR_BOLETO                                                                           "NR. BOLETO",
       T.DT_VENCIMENTO                                                                       "VENCIMENTO", 
       TO_CHAR(T.VL_DOCUMENTO, 'L9,999.99')                                                  "VALOR DO TÍTULO", 
       P.DT_PAGAMENTO                                                                        "DATA PAGTO",
       TO_CHAR(NVL((T.VL_DOCUMENTO * P.VL_PERC_JUROS)/100 + P.VL_PAGO, 0), 'L9,999.99')      "VALOR PAGO",
       TO_CHAR(NVL(P.VL_JUROS, 0), 'L9,999.99')                                               "JUROS" 
FROM T_PS2_MATRICULA M INNER JOIN T_PS2_TITULO T
ON (M.CD_ALUNO = T.CD_ALUNO)

INNER JOIN T_PS2_TITULO_PAGO P
ON (T.CD_ALUNO = P.CD_ALUNO) 
WHERE TO_CHAR(T.DT_VENCIMENTO, 'MM/YYYY') IN ('09/2014') AND TO_CHAR(P.DT_PAGAMENTO, 'MM/YYYY') IN ('09/2014') AND NVL((T.VL_DOCUMENTO * P.VL_PERC_JUROS)/100 + P.VL_PAGO, 0) = 0 
ORDER BY T.DT_VENCIMENTO ASC, T.VL_DOCUMENTO ASC; 



/*
SELECT * FROM T_PS2_TITULO_PAGO ;
SELECT * FROM T_PS2_MODALIDADE_PLANO  ;
SELECT * FROM T_PS2_EXAME_MEDICO  ;
SELECT * FROM T_PS2_PROF_MODALIDADE  ;
SELECT * FROM T_PS2_TIPO_MODALIDADE ;
SELECT * FROM T_PS2_INSTITUICAO ;
SELECT * FROM T_PS2_MEDICO  ;
SELECT * FROM T_PS2_MODALIDADE  ;
SELECT * FROM T_PS2_PROFESSOR  ;
SELECT * FROM T_PS2_TITULO  ;
SELECT * FROM T_PS2_MATRICULA ;
SELECT * FROM T_PS2_PLANO  ;
SELECT * FROM T_PS2_ALUNO ;
*/