# Método de NLP - Natural Language Processing
# Processamento de Linguagem Natural

# CoLab Link: https://colab.research.google.com/drive/1A9mcvwfWzEUQMSlKnB50v-ChEihI06tC?usp=sharing

# Bibliotecas Requeridas
import numpy as np
import sklearn
from sklearn.feature_extraction.text import CountVectorizer

# Analise de N-gramas, que é a uma repetição de elementos de uma frase, como palavras letras e simbolos
# Separando em Unigramas de N-gramas (Vectorizer ajuda através das matrizes de comparação)

frase_base = "One Monday afternoon, Mike, adopting a very unusual style, wore a hoody. Nobody would ever think of wearing a hoody on a very hot day. His friends also wondered why he was being weird. They became a little aloof with Mike that day.";
frase_comparacao = "The next day, Mike wore a hoody again, this time of a different color. This went on every day for a week and his friends gradually got used to it. Finally, on the eighth day, Mike wore a plain white shirt, acting like nothing had been amiss for the past week.";

# N_gramas
# OBS:. Aqui está 1 para Unigrama, porém o valor poder ser alterado para:
# 2 - Bigrama   (2 Palavras)
# 3 - Trigrama  (3 Palavras)
# 4 - Quadgrama (4 Palavras)
# assim por diante...

n = 1

# Instancia da contagem de N-Gramas
# OBS:. O parametro world no analyzer para anlise, não contabiliza alguns elementos como artigos, e foca no texto em si, uma alternativa seria:
# token_pattern com REGEX

contagem = CountVectorizer(analyzer='word', ngram_range=(n, n))

# Matriz de contagem dos textos
n_gramas = contagem.fit_transform([frase_comparacao, frase_base])

# Dicionário de N-Gramas
dicionario = contagem.fit([frase_comparacao, frase_base]).vocabulary_

#print(dicionario)

# Criar lista de N-Gramas
lista_n_gramas = n_gramas.toarray()

# O resultado da lista de baseia na contagem comparativa entre as duas tuplas da listas, onde cada indice em ordem vai citar a ocorrencia de aparecimento
# Baseado no texto_base
# print("Lista de N-Gramas: ")
# print("")
# print(lista_n_gramas)
# print("")
# print("Dicionário de N-Gramas: ")
# print("")
# print(dicionario)

# Contabilização de semelhança - Containment
# Interseção N-Grama entre o texto base e o comparado, adicionando o número de termos comuns e normalizando os valores obtidos pelo numero de N-Gramas do texto base A
# Formula Base: https://prnt.sc/22ioqt0

# Contar o minimo = Interseções
lista_de_intersecao = np.amin(n_gramas.toarray(), axis=0)

# Contar quanto para o valor do Array em Interseções
contagem_de_intersecao = np.sum(lista_de_intersecao)

# Contagem em base do texto no N-Grama - Interseção e Divisão -> Normalização
indiceA = 0
contagemA = np.sum(n_gramas.toarray()[indiceA])

# Grau de Similaridade
grau_similaridade = contagem_de_intersecao / contagemA

# Porcentagem de Similaridade
porcentagem_similaridade = grau_similaridade * 100

#Resultados
print("Resultado do Containment - Similaridade\n\n")
print("Base: {}\n".format(frase_base))
print("Comparativo: {}\n\n".format(frase_comparacao))
print("Grau de Similaridade: {}".format(grau_similaridade))
print("Porcentagem de Similaridade: {:.2f}%".format(porcentagem_similaridade))
print("\nOBS:. Porcentagem arredondado em 2 casas decimais")