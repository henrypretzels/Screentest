# Screentest - Aplicativo Android de Demonstração do Ciclo de Vida

## 📱 Descrição

Este é um aplicativo Android de demonstração que ilustra o ciclo de vida completo das Activities e a navegação entre telas. O projeto foi desenvolvido em **Kotlin** e utiliza layouts **XML** tradicionais (sem Jetpack Compose).

## ✨ Funcionalidades

- **MainActivity**: Tela principal com botão de navegação
- **SecondActivity**: Segunda tela com botão de retorno
- **Logging Completo**: Todas as etapas do ciclo de vida são registradas no Logcat
- **Navegação**: Transição suave entre as duas Activities
- **Interface Limpa**: Design simples e intuitivo

## 🏗️ Arquitetura

### Activities
- `MainActivity`: Activity principal (launcher)
- `SecondActivity`: Activity secundária

### Layouts
- `activity_main.xml`: Layout da tela principal
- `activity_second.xml`: Layout da segunda tela

### Recursos
- Tema AppCompat para compatibilidade
- Dependências tradicionais do Android (sem Compose)
- Gradle configurado para Views tradicionais

## 🔄 Ciclo de Vida das Activities

O aplicativo demonstra e registra todos os métodos do ciclo de vida:

- `onCreate()` - Criação da Activity
- `onStart()` - Início da Activity
- `onResume()` - Activity em primeiro plano
- `onPause()` - Activity pausada
- `onStop()` - Activity parada
- `onRestart()` - Activity reiniciada
- `onDestroy()` - Activity destruída

## 🚀 Como Executar

### Pré-requisitos
- Android Studio (versão mais recente)
- SDK Android 30+ (API 30)
- Gradle 8.11.1+

### Passos
1. Clone o repositório
2. Abra o projeto no Android Studio
3. Sincronize o Gradle
4. Execute o aplicativo em um emulador ou dispositivo

### Via Terminal
```bash
./gradlew build
./gradlew installDebug
```

## 📊 Logs e Debug

Para visualizar os logs do ciclo de vida:

1. Abra o **Logcat** no Android Studio
2. Filtre por tag: `MainActivity` ou `SecondActivity`
3. Navegue entre as telas para ver os logs em tempo real

**Exemplo de log:**
```
I/MainActivity: onCreate() chamado
I/MainActivity: onStart() chamado
I/MainActivity: onResume() chamado
```

## 🛠️ Tecnologias Utilizadas

- **Linguagem**: Kotlin
- **UI**: XML Layouts (Views tradicionais)
- **Build System**: Gradle
- **Dependências**: AppCompat, ConstraintLayout, Material Design
- **Tema**: AppCompat Light DarkActionBar

## 📁 Estrutura do Projeto

```
app/
├── src/main/
│   ├── java/com/example/screentest/
│   │   ├── MainActivity.kt
│   │   └── SecondActivity.kt
│   ├── res/
│   │   ├── layout/
│   │   │   ├── activity_main.xml
│   │   │   └── activity_second.xml
│   │   └── values/
│   │       ├── colors.xml
│   │       ├── strings.xml
│   │       └── themes.xml
│   └── AndroidManifest.xml
├── build.gradle.kts
└── proguard-rules.pro
```

## 🔧 Configuração

### Dependências Principais
```kotlin
implementation(libs.androidx.core.ktx)
implementation(libs.androidx.appcompat)
implementation(libs.androidx.constraintlayout)
implementation(libs.material)
```

### Versões
- **compileSdk**: 36
- **minSdk**: 30
- **targetSdk**: 36
- **Kotlin**: 2.0.21

## 📝 Notas de Desenvolvimento

- Este projeto foi convertido de Jetpack Compose para Views tradicionais
- Todos os logs estão em português brasileiro
- Interface simples para demonstrar conceitos básicos
- Configuração otimizada para aprendizado e demonstração

## 🤝 Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para:

1. Fazer um fork do projeto
2. Criar uma branch para sua feature
3. Fazer commit das suas mudanças
4. Abrir um Pull Request

## 📄 Licença

Este projeto está sob a licença MIT. Veja o arquivo `LICENSE` para mais detalhes.

## 👨‍💻 Autor

Desenvolvido como projeto de demonstração para Android.

---

**⭐ Se este projeto foi útil, considere dar uma estrela!**
