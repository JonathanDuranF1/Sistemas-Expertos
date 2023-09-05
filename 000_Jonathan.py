# Premisa 1: Si llueve, la calle estará mojada
# Premisa 2: Está lloviendo

premisa1 = True
premisa2 = True

# Aplicando el modus ponens para llegar a una conclusión

if premisa2:
    if premisa1:
        conclusion = "La calle estará mojada."
    else:
        conclusion = "No podemos determinar si la calle está mojada o no."
else:
    conclusion = "No podemos determinar si la calle está mojada o no."

print(conclusion)
