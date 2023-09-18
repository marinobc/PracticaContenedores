# Comandos comunes

## Creando una llave ssh

Moverse a carpeta ssh

```bash
cd ~/.ssh
```

Mostrar los elementos en la carpeta

```bash
ls
```

Generar una llave

```bash
ssh-keygen
```

Mostrar nuevamente los elementos en la carpeta

```bash
ls
```

Mostrar el contenido del archivo, sera la llave publica a usar en los servicios

```bash
cat ~/.ssh/id_rsa.pub
```

## Configurando identidad en git

Difiniendo identidad en git

```bash
git config --global user.name "marino barroso"
git config --global user.email marinobarroso2000@gmail.com
```

Revisando dato por dato

```bash
git config --get user.name 
git config --get user.email 
```

Cambiando rama por defecto de ```master``` a ```main```

```bash
git config --global init.defaultBranch main
```

Listando la configuracion de git

```bash
git config --list
```

## Iniciando un repositorio

Iniciando el versionamiento

```bash
git init
```

Revisando archivos en el directorio (si no hay .gitingnore crearlo)

```bash
ls
```

Añadiendo todos los archivos al control de cambios

```bash
git add .
```

Registrando los primeros cambios en el repositorio

```bash
git commit -m "Inicio de proyecto"
```

Añadiendo origen remoto para alojamiento del repositorio (Recomendable tener ssh configurado)

```bash
git remote add origin git@github.com:marinobc/PracticaContenedores.git
```

Subiendo los cambios a la rama main en el repositorio (Revisar que la rama se llama main, caso contrario cambiarlo)

```bash
git push -u origin main
```
Para sincronizar archivos en el repositorio remoto

```bash
git pull
```