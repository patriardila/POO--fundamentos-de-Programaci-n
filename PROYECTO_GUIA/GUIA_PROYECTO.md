# Guía de trabajo: del prototipo a la aplicación publicada

Esta guía explica cómo convertir su prototipo HTML en una aplicación real, usando IA para generar código, trabajando por módulos y registrando el avance en GitHub.

Consúltenla cada vez que empiecen una sesión de trabajo.

---

## 1. Reglas de trabajo con IA

1. **La IA solo recuerda lo que está en la misma conversación.** Si abren un chat nuevo, empieza de cero. Por eso cada conversación nueva empieza pegando el archivo `CONTEXTO.md` del equipo.
2. **Una conversación por módulo.** No mezclen varios módulos en el mismo chat.
3. **No pasen al siguiente módulo hasta que el actual funcione completo.**
4. **Publiquen desde la primera semana.** Primero una página mínima en internet; después, cada módulo terminado se publica de inmediato. No dejen la publicación para el final: es el paso donde más cosas fallan.
5. **Cuando aparezca un error, peguen el mensaje completo.** No lo resuman ni lo describan con sus palabras.
6. **Todo código que suban, cualquier integrante debe poder explicarlo.** Si no lo entienden, pídanle a la IA que lo explique antes de subirlo.
7. **Si la IA propone cambiar de herramienta a mitad del proyecto, no acepten.** Pregúntenle cómo resolverlo con las herramientas que ya eligieron.

---

## 2. Editor de trabajo: Visual Studio Code

Usen **Visual Studio Code (VS Code)** para el proyecto. Es gratuito, funciona con cualquier herramienta que elijan (Python, HTML, JavaScript u otras) y trae Git integrado para subir cambios a GitHub.

NetBeans se queda para la clase de Java. No lo usen para el proyecto web.

### Extensiones que deben instalar

| Extensión | Para qué sirve |
|---|---|
| **Python** (de Microsoft) | Ejecutar y depurar Python, y elegir el intérprete |
| **SQLite Viewer** | Ver las tablas de la base de datos dentro de VS Code |
| **Live Server** | Ver los archivos HTML en el navegador mientras los editan |
| **Spanish Language Pack** | Opcional: el menú en español |

No instalen más extensiones de las necesarias. Cada extensión extra puede generar conflictos y mensajes difíciles de entender.

### Configuración obligatoria desde el primer día

1. **Al instalar Python, marquen la casilla "Add Python to PATH".** Si no la marcan, Python no funciona desde la terminal.
2. **Creen un entorno virtual (`venv`) para el proyecto** y selecciónenlo en VS Code como intérprete. Pídanle a la IA las instrucciones paso a paso para Windows.
3. **Instalen los paquetes desde la terminal de VS Code**, con el entorno virtual activado, no desde otra ventana.

### Error más común

```
ModuleNotFoundError: No module named 'flask'
```

Aparece aunque hayan instalado el paquete. Significa que lo instalaron en un Python distinto al que está usando VS Code. Solución: verifiquen que el entorno virtual esté activado y seleccionado como intérprete, y vuelvan a instalar el paquete desde la terminal de VS Code.

---

## 3. Antes de empezar: preparar el repositorio

El proyecto va en un **repositorio nuevo del equipo**, distinto del repositorio individual de la clase.

### Crear y compartir el repositorio

1. **Un integrante crea el repositorio** en su cuenta de GitHub, con el nombre del proyecto.
2. **Ese integrante agrega a los demás como colaboradores:** en el repositorio, *Settings* → *Collaborators* → *Add people*, y escribe el usuario de GitHub de cada compañero.
3. **Cada compañero acepta la invitación.** Llega al correo y a las notificaciones de GitHub. Sin aceptarla, no puede subir cambios y GitHub le muestra un error de permisos.
4. **Comprueben que todos pueden subir:** cada integrante hace un primer commit pequeño, por ejemplo escribiendo su nombre en la tabla de integrantes de `CONTEXTO.md`.
5. **Compartan el enlace del repositorio con sus profesores.** Si el repositorio es privado, agréguenlos también como colaboradores.

### Contenido inicial

1. Copien al repositorio las dos plantillas:
   - `CONTEXTO.md`: el estado actual del proyecto. Es lo que le pegan a la IA.
   - `BITACORA.md`: el registro semana a semana de lo que hicieron.
2. Suban la carpeta `prototipo/` con su prototipo HTML y la ficha en PDF.

Estructura inicial del repositorio:

```
nombre-del-proyecto/
├── CONTEXTO.md
├── BITACORA.md
└── prototipo/
    ├── prototipo.html
    └── ficha.pdf
```

---

## 4. Paso 1: obtener la ruta de trabajo

Abran una conversación nueva con la IA. Adjunten el prototipo HTML y la ficha en PDF, y peguen este texto completando los datos entre corchetes:

```
Somos un equipo de estudiantes universitarios PRINCIPIANTES. Nunca hemos
construido una aplicación completa ni la hemos publicado en internet.

LO QUE SABEMOS:
- Fundamentos de programación en Python y Java.
- Programación orientada a objetos: clases, encapsulamiento, herencia.
- Estructuras de datos: listas, ArrayList.
- HTML básico.
LO QUE NO SABEMOS:
- Bases de datos.
- Desarrollo web con backend.
- Publicar (desplegar) una aplicación.

NUESTRO PROYECTO: adjuntamos el prototipo en HTML y la ficha de diseño
(agentes, actividades, clases, datos y métodos). Queremos convertir ese
prototipo en una aplicación web real y publicada.

TIEMPO: [N] semanas, [H] horas por semana, [X] integrantes.
Trabajamos en computadores con Windows.
Usaremos Visual Studio Code como editor.

1. HERRAMIENTAS
Recomiéndanos las herramientas MÁS FÁCILES para nuestro nivel, en este orden:
   a) Frontend (lo que ve el usuario).
   b) Backend (la lógica y las reglas).
   c) Base de datos.
   d) Publicación gratuita.
Para cada una: dinos por qué es la más fácil para NOSOTROS, qué tenemos
que aprender y cómo instalarla paso a paso.
Solo herramientas gratuitas. Máximo una herramienta por capa.
Evita frameworks complejos (como React, Angular, Django o Spring) y Docker.
Aprovecha nuestro prototipo HTML en lugar de empezar de cero.

2. DISEÑO DE LA BASE DE DATOS
A partir de nuestra ficha, propón las tablas, sus columnas y cómo se
relacionan. Explica cada decisión en lenguaje sencillo.

3. MÓDULOS
Divide el proyecto en módulos pequeños. Cada módulo debe funcionar
completo de principio a fin (pantalla + lógica + datos) antes de pasar
al siguiente. Ordénalos del más sencillo al más complejo y explica por
qué ese orden.

4. RUTA PASO A PASO
Para cada módulo:
- Tareas pequeñas (máximo 2 horas cada una) con un responsable.
- Qué debe funcionar al terminar y cómo comprobarlo.
- El error más común en ese módulo y cómo evitarlo.
Organiza los módulos semana a semana según nuestro tiempo.

REGLAS:
- Usa la forma de organizar el código más sencilla para nuestro nivel
  (clases, funciones o ambas). Explica por qué la elegiste.
- En la PRIMERA semana, ayúdanos a publicar una versión mínima (una página
  que diga "Hola") con la herramienta de publicación elegida. Después, cada
  módulo terminado se publica de inmediato.
- No generes todo el código ahora. Lo pediremos módulo por módulo.
- Cuando generes código, explica las partes importantes para que
  cualquier integrante pueda explicarlas.
- Si nuestro proyecto es muy grande para el tiempo, dinos qué recortar.
- Antes de responder, haznos las preguntas que necesites.
```

### Al terminar: crear `RUTA.md` y `CONTEXTO.md`

1. **Guarden la respuesta completa de la IA** en el repositorio como `RUTA.md`. Es el plan que consultan para saber qué sigue.
2. **En esa misma conversación**, pídanle a la IA que llene `CONTEXTO.md`:

```
Con todo lo que acabamos de definir, llena esta plantilla.
Usa exactamente las herramientas, tablas y módulos que propusiste.
Deja la tabla de integrantes y el "Módulo actual" para que los llenemos nosotros.

[pegar aquí la plantilla CONTEXTO.md]
```

3. **Revisen que coincida con `RUTA.md`**, completen los integrantes y súbanlo a GitHub.

| Archivo | Qué contiene | Cuándo se usa |
|---|---|---|
| `RUTA.md` | La respuesta completa de la IA: semanas, tareas, errores comunes | Para saber qué sigue |
| `CONTEXTO.md` | El resumen: herramientas, tablas, módulos y estado actual | Se pega al inicio de cada conversación nueva |

No peguen `RUTA.md` completa en cada conversación: la IA recibe demasiado texto que no aplica y se distrae.

---

## 5. Paso 2: revisar el diseño de la base de datos

La IA propone las tablas a partir de su ficha. Antes de aceptarlas, verifiquen que siguen esta regla:

| En su ficha | En la base de datos | Ejemplo |
|---|---|---|
| Cada clase | Una tabla | `Vuelo` → tabla `vuelos` |
| Los datos de la clase | Las columnas | destino, fecha, precio |
| (No está en la ficha) | Una columna `id` en cada tabla | Identifica cada registro |
| Cada relación TIENE UN | Una columna que apunta a otra tabla | Una Reserva TIENE UN Cliente → `reservas.cliente_id` |
| Los campos de los formularios del prototipo | Confirman qué columnas faltan | Si el formulario pide teléfono, va una columna |
| La herencia (Cliente y Administrador son Usuario) | Una sola tabla con una columna `tipo` | `usuarios`, con tipo = cliente o admin |

**Error común:** guardar datos que se calculan, como `total_a_pagar`. Si un dato se puede calcular con otros datos, no se guarda: lo calcula un método.

**Importante:** la base de datos se **diseña** completa al inicio, pero se **crea** por partes. Cada módulo crea solo la tabla que necesita.

---

## 6. Paso 3: trabajar módulo por módulo

Repitan este ciclo para cada módulo:

1. **Abrir una conversación nueva** con la IA.
2. **Pegar `CONTEXTO.md`** completo.
3. **Pedir el módulo** con el texto de abajo.
4. **Probar** que funciona, según lo que indicó la ruta.
5. **Explicar:** cada integrante debe poder explicar el código del módulo.
6. **Subir a GitHub** (sección 7).
7. **Actualizar** `CONTEXTO.md` y `BITACORA.md`.

Texto para pedir un módulo:

```
Este es el contexto de nuestro proyecto:
[pegar aquí CONTEXTO.md completo]

Esta es la parte de nuestra ruta para este módulo:
[pegar aquí SOLO la sección de RUTA.md de este módulo]

Vamos a construir el módulo: [nombre del módulo].
Guíanos paso a paso, tarea por tarea. Después de cada tarea, espera a que
confirmemos que funciona antes de seguir.
Usa solo las herramientas y las tablas indicadas en el contexto.
Explica las partes importantes del código.
```

Texto para cuando aparece un error:

```
Estamos en el módulo [nombre]. Al hacer [lo que intentaban hacer]
aparece este error:
[pegar aquí el mensaje completo]

Este es el código del archivo donde ocurre:
[pegar el código]

Explícanos por qué ocurre y cómo corregirlo, sin cambiar de herramientas.
```

Texto para actualizar el contexto al terminar un módulo (en la misma conversación del módulo):

```
Terminamos el módulo [nombre]. Actualiza nuestro CONTEXTO.md con lo que
hicimos en esta conversación:
- Marca el módulo como Terminado y, si ya lo publicamos, como Publicado.
- Agrega los datos nuevos que guarda el sistema.
- Actualiza la estructura de carpetas.
- Registra las decisiones importantes y los problemas que quedaron pendientes.
No cambies nada que no hayamos hecho. Devuélvelo completo.

Este es nuestro CONTEXTO.md actual:
[pegar aquí CONTEXTO.md]
```

Revisen que el resultado sea correcto, reemplacen el contenido de `CONTEXTO.md` en GitHub y hagan commit con el mensaje `Módulo [número]: actualizar contexto`.

### ¿Cuándo está terminado un módulo?

- [ ] La pantalla funciona en el navegador.
- [ ] Los datos se guardan y se consultan en la base de datos.
- [ ] Probaron con datos correctos y con datos incorrectos.
- [ ] Cualquier integrante puede explicar el código.
- [ ] Está subido a GitHub.
- [ ] Está publicado y funciona en internet, no solo en su computador.
- [ ] `CONTEXTO.md` y `BITACORA.md` están actualizados.

---

## 7. Cómo registrar el avance en GitHub

### Herramienta recomendada

Usen el **Control de código fuente de VS Code** (el ícono de ramas en la barra lateral izquierda). Permite hacer commit y subir cambios con botones, sin escribir comandos. La primera vez, VS Code les pedirá iniciar sesión con su cuenta de GitHub.

Si prefieren una aplicación aparte, **GitHub Desktop** hace lo mismo.

### Reglas

1. **Antes de empezar a trabajar, descarguen los cambios** de sus compañeros (en VS Code: botón *Sincronizar cambios* o *Pull*; en GitHub Desktop: *Fetch origin* y luego *Pull*).
2. **Suban cambios pequeños y frecuentes**, al menos uno por sesión de trabajo. No suban todo el último día.
3. **Cada integrante sube su propio trabajo desde su cuenta.** Los commits muestran quién hizo qué, y eso se revisa en la evaluación individual.
4. **Cada integrante trabaja en archivos distintos**, según el módulo o la tarea asignada. Así evitan conflictos.
5. **No suban contraseñas** ni archivos de configuración con claves.

### Cómo escribir el mensaje del commit

Formato: `Módulo [número]: [qué hicieron]`

Buenos ejemplos:
- `Módulo 1: formulario de registro de clientes`
- `Módulo 1: guardar cliente en la base de datos`
- `Módulo 2: corregir error al listar vuelos`

Malos ejemplos: `cambios`, `avance`, `ya funciona`, `asdf`.

### Qué se actualiza cada semana

- **`CONTEXTO.md`:** el estado actual. Qué módulos están terminados, en curso o pendientes, y qué tablas existen.
- **`BITACORA.md`:** una entrada por semana. Qué hicieron, quién lo hizo, qué problemas tuvieron y qué sigue.

---

## 8. Qué se revisa

- Que el repositorio tenga commits de **todos** los integrantes, a lo largo de las semanas.
- Que `CONTEXTO.md` y `BITACORA.md` estén al día.
- Que cada módulo marcado como terminado funcione **en la versión publicada**.
- En la sustentación: **cualquier integrante debe explicar cualquier parte del código.** El código generado por IA que nadie del equipo puede explicar no cuenta como trabajo del equipo.
