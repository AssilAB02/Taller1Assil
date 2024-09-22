Link al repositorio:https://github.com/AssilAB02/Taller1Assil.git

# Proyecto Android Básico

Este es un proyecto básico de una aplicación Android que incluye una pantalla de inicio, una actividad principal y una pantalla de configuración. La aplicación muestra un saludo personalizado basado en la hora del día y permite al usuario navegar entre diferentes actividades.

## Funcionalidades

1. **Pantalla de Inicio:**
   - Muestra un saludo personalizado basado en la hora del día (Buenos días, Buenas tardes, Buenas noches).
   - Incluye un botón para navegar a la actividad principal.

2. **Actividad Principal:**
   - Permite al usuario ingresar su nombre.
   - Muestra el nombre ingresado en un `TextView`.
   - Incluye un botón para navegar a la pantalla de configuración.

3. **Pantalla de Configuración:**
   - Permite cambiar el color del fondo de la aplicación.
   - Incluye un botón para volver a la pantalla de inicio.

## Estructura del Proyecto

El proyecto está dividido en las siguientes clases y layouts:

### 1. **MainActivity.kt**
   - Muestra un saludo según la hora del día.
   - Navega hacia la `PrincipalActivity`.

### 2. **PrincipalActivity.kt**
   - Permite al usuario ingresar y mostrar su nombre.
   - Navega hacia la `SettingsActivity`.

### 3. **SettingsActivity.kt**
   - Permite cambiar el color de fondo de la pantalla.
   - Navega de vuelta a la `MainActivity`.

## Archivos de Layout

### 1. **activity_main.xml**
   - Layout para la `MainActivity`.
   - Incluye un `TextView` para mostrar el saludo y un botón para navegar a la actividad principal.

### 2. **activity_principal.xml**
   - Layout para la `PrincipalActivity`.
   - Incluye un campo de texto para ingresar el nombre y un botón para navegar a la configuración.

### 3. **activity_settings.xml**
   - Layout para la `SettingsActivity`.
   - Incluye un botón para cambiar el color de fondo y un botón para regresar a la pantalla de inicio.

## Instrucciones de Uso

1. Clona este repositorio en tu máquina local:
   ```bash
   git clone https://github.com/usuario/nombre-repositorio.git
