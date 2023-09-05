# Premisa 1: Si el usuario está autenticado, entonces tiene acceso.
# Premisa 2: El usuario no tiene acceso.

premisa1 = True
premisa2 = False

# Aplicando el modus tollens para llegar a una conclusión

if not premisa2:
    if premisa1:
        conclusion = "El usuario está autenticado."
    else:
        conclusion = "No podemos determinar si el usuario está autenticado o no."
else:
    conclusion = "El usuario no está autenticado."

print(conclusion)
