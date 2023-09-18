import os

def iniciar_chat():
    conversaciones = []  # Lista para almacenar las conversaciones

    # Verificar si el archivo de conversaciones ya existe y cargarlo si es así
    if os.path.exists("conversaciones.txt"):
        with open("conversaciones.txt", "r") as archivo:
            conversaciones = archivo.readlines()

    while True:
        mensaje_usuario = input("Usuario: ")  # Obtener el mensaje del usuario
        conversaciones.append(f"Usuario: {mensaje_usuario}\n")  # Agregar mensaje del usuario a la lista
        respuesta = obtener_respuesta(mensaje_usuario)  # Obtener la respuesta del chatbot
        conversaciones.append(f"Chatbot: {respuesta}\n")  # Agregar respuesta del chatbot a la lista
        print("Chatbot:", respuesta)  # Mostrar respuesta al usuario

        # Preguntar si el usuario quiere agregar conocimiento nuevo
        agregar_conocimiento = input("¿Deseas agregar conocimiento nuevo? (Sí/No): ").lower()
        if agregar_conocimiento == "sí" or agregar_conocimiento == "si":
            pregunta_nueva = input("Por favor, introduce una pregunta para agregar conocimiento nuevo: ")
            respuesta_nueva = input("Introduce la respuesta a la pregunta: ")
            guardar_conocimiento_nuevo(pregunta_nueva, respuesta_nueva)

        # Preguntar si el usuario quiere continuar
        continuar = input("¿Quieres continuar chateando? (Sí/No): ").lower()
        if continuar != "sí" and continuar != "si":
            break

    # Guardar las conversaciones en un archivo de texto
    with open("conversaciones.txt", "w") as archivo:
        archivo.writelines(conversaciones)

def obtener_respuesta(mensaje_usuario):
    # Aquí puedes agregar lógica para generar respuestas basadas en las preguntas del usuario.
    # Por ahora, simplemente proporcionaremos respuestas predefinidas.
    respuestas = {
        "Hola": "¡Hola! Estoy aquí para ayudarte. ¿Sobre qué te gustaría hablar?",
        "¿Cómo estás?": "Estoy bien, gracias por preguntar.",
        "Temas de los que podemos hablar": "Podemos hablar sobre cualquier cosa que desees. ¿Tienes alguna pregunta en mente?",
    }
    
    # Buscar una respuesta predefinida para el mensaje del usuario
    if mensaje_usuario in respuestas:
        return respuestas[mensaje_usuario]
    else:
        return "No estoy seguro de cómo responder a eso. ¿Tienes alguna otra pregunta?"

def guardar_conocimiento_nuevo(pregunta, respuesta):
    # Aquí puedes agregar código para guardar la nueva pregunta y respuesta en un archivo o base de datos.
    # Por ahora, simplemente imprimiremos la pregunta y respuesta.
    print("Pregunta nueva:", pregunta)
    print("Respuesta nueva:", respuesta)

if __name__ == "__main__":
    print("¡Bienvenido al chat! Comienza escribiendo 'Hola'.")
    iniciar_chat()
