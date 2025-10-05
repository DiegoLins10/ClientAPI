
# Roda a aplicação Spring Boot
mvn spring-boot:run

# Instalar maven e java 25
1 - installar maven mvn -v
2 - mvn clean install

## ⚙️ 1️⃣ Verificar se o Maven está instalado

No terminal do Windows (ou PowerShell), digite:

```bash
mvn -v
```

Se aparecer:

```
O termo 'mvn' não é reconhecido...
```

👉 então o Maven **não está configurado no PATH**.

---

## 🧱 2️⃣ Baixar o Maven

Baixe a versão mais recente (recomendo a 3.9.x):
🔗 [https://maven.apache.org/download.cgi](https://maven.apache.org/download.cgi)

Baixe o **arquivo ZIP** (“Binary zip archive”).

---

## 📦 3️⃣ Instalar o Maven

1. Extraia o ZIP em uma pasta fácil, por exemplo:

   ```
   C:\Program Files\Apache\Maven
   ```

   (dentro dela você verá `bin`, `conf`, etc.)

2. Copie o caminho da pasta **bin**:

   ```
   C:\Program Files\Apache\Maven\bin
   ```

---

## ⚙️ 4️⃣ Adicionar o Maven ao PATH

### 🪟 No Windows:

1. Pesquise **“Variáveis de ambiente”**
2. Clique em **“Editar variáveis de ambiente do sistema”**
3. Vá em **Variáveis de ambiente**
4. Na seção **Variáveis do sistema**, procure **Path** → clique em **Editar**
5. Clique em **Novo** → cole o caminho:

   ```
   C:\Program Files\Apache\Maven\bin
   ```
6. Clique em **OK** até fechar tudo

---

## 🔁 5️⃣ Reinicie o VS Code (ou o terminal)

Depois disso, teste de novo:

```bash
mvn -v
```

Você deve ver algo assim:

```
Apache Maven 3.9.9
Java version: 25
```

---

## ✅ 6️⃣ Teste no projeto

Agora dentro da pasta do seu projeto (onde está o `pom.xml`):

```bash
mvn clean install
```
