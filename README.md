
🧱 Modular Architecture
This project is built using a multi-module structure following Clean Architecture principles, with a clear separation between features and core packages.

🗂️ Module Structure
:app
The application’s entry point. It connects and orchestrates all necessary modules to run the app.

:feature:currency-convertor
Contains the business logic and UI for the currency converter feature. This is the main functional module and consumes multiple :core modules.

⚙️ Core Modules
Module	Responsibility
:core:common	Utility functions, extensions, and reusable constants.
:core:data	Data abstraction layer: repositories, mappers, etc.
:core:database	Room DB access and persistent entities.
:core:designsystem	Standardized UI components and global styles.
:core:model	Shared data models across modules.
:core:network	Network configuration: Retrofit, interceptors, etc.
:core:testing	Test utilities for unit and integration testing.
:core:ui	Base UI components (e.g., loading indicators, error views).

📊 Module Dependency Diagram (Mermaid)
<details> <summary>Click to expand</summary>
mermaid

graph TD
  app --> feature_currency_convertor
  feature_currency_convertor --> core_common
  feature_currency_convertor --> core_data
  feature_currency_convertor --> core_network
  feature_currency_convertor --> core_database

  core_data --> core_network
  core_data --> core_ui
  core_ui --> core_designsystem
  core_network --> core_common
  core_database --> core_model
</details>
✅ Benefits
🔄 Clear separation of concerns – each module has a well-defined purpose.

🧪 Increased testability – modules are isolated and easy to test.

♻️ High reusability – shared utilities and components can be reused across features.

🚀 Scalability – easy to extend with new features without impacting existing logic.



![Screenshot 2025-06-11 at 17 59 52](https://github.com/user-attachments/assets/7ef93728-27da-40b2-b8f1-eabfb498deb9)
<img width="397" alt="Screenshot 2025-06-11 at 18 02 51" src="https://github.com/user-attachments/assets/f8273326-89d4-4247-a723-e4cc688a4151" />
