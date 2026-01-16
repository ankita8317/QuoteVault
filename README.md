# **📘 QuoteVault – Quote Discovery App**

---

## **Overview**

QuoteVault is a modern **Android quote discovery and collection app** built using **Kotlin and Jetpack Compose**.  
This project was developed as part of an **AI-tool proficiency assignment**, focusing on how effectively AI tools can be used to design, build, debug, and polish a real application.

---

## **🚀 Implemented Features**

### **Authentication & User Flow**
- Login screen with session-based state
- App opens with login and navigates to main app after successful login  
*(Local authentication used for demo stability)*

---

### **Quote Browsing & Discovery**
- Home feed displaying quotes
- “Quote of the Day” (changes daily using date-based logic)
- Search quotes by text or author
- Graceful empty states

---

### **Favorites**
- Add / remove quotes to favorites
- Dedicated Favorites screen
- Shared repository ensures consistent state across screens

---

### **Sharing**
- Share quotes as text using Android system share sheet

---

### **UI & UX Polish**
- Built with **Jetpack Compose (Material 3)**
- Green 💚 & white 🤍 design system
- Rounded cards, elevation, and clean spacing
- Bottom navigation (Home / Favorites)
- Clear visual hierarchy

---

## **🛠️ Tech Stack**

- **Language:** Kotlin  
- **UI:** Jetpack Compose (Material 3)  
- **Architecture:** Repository pattern (single source of truth)  
- **State Management:** Compose state  
- **Navigation:** Scaffold + Bottom Navigation  
- **Minimum SDK:** 24  

---
## **📂 Project Structure**

com.example.quotevault
│
├── data
│ ├── QuoteRepository.kt
│ └── DailyQuoteManager.kt
│
├── model
│ └── Quote.kt
│
├── ui
│ ├── auth
│ │ └── LoginScreen.kt
│ ├── home
│ │ ├── HomeScreen.kt
│ │ └── QuoteCard.kt
│ ├── favorites
│ │ └── FavoritesScreen.kt
│ └── theme
│ ├── Color.kt
│ └── Theme.kt
│
└── MainActivity.kt


---

## **⚙️ Setup Instructions**

### **Prerequisites**
- Android Studio (latest stable)
- JDK 17+
- Android SDK (API 24+)

### **Run Locally**
```bash
git clone https://github.com/ankita8317/QuoteVault.git

Open the project in Android Studio

Let Gradle sync

Run on emulator or physical device

🔐 Supabase Configuration (Planned)

Supabase was part of the original assignment requirements.

For this submission:

Authentication and quote data are handled locally

This ensured faster iteration, stability, and UI polish

Supabase can be integrated by replacing QuoteRepository with a Supabase-backed data source and adding API keys

This decision follows the assignment recommendation to prioritize core features and polish over incomplete integrations.

🤖 AI Coding Approach & Workflow

AI tools were used throughout the development lifecycle.

How AI Was Used

Designing Jetpack Compose layouts

Debugging Compose state and recomposition issues

Resolving Gradle and dependency conflicts

Refactoring into clean architecture

UI polish and consistency improvements

Workflow

Feature planning with AI

Rapid code generation using AI tools

Manual review and refactoring

Debugging with AI assistance

Final UI polish and cleanup

🧠 AI Tools Used

ChatGPT – architecture planning, debugging, UI polish

Cursor AI – code generation, refactoring, error fixing

Android Studio tools – previews and inspections

AI was used to accelerate development, while architectural decisions were made manually.

🎨 Design Process

Initial UI ideas generated with AI-assisted design suggestions

Green & white color palette chosen for calm and readable UI

Designs translated directly into Jetpack Compose components

Focus on spacing, typography, and visual hierarchy

⚠️ Known Limitations

Authentication is local (no backend persistence)

Favorites are stored in memory (not cloud synced)

No widget implemented

No push notifications

Share card image generation not implemented (text sharing only)

🌱 Future Improvements

Supabase authentication and cloud sync

Push notifications for daily quotes

Home screen widget

Image-based share cards

User profile and settings persistence
## **📂 Project Structure**

