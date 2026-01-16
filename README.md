📘 QuoteVault – Quote Discovery App

QuoteVault is a modern Android quote discovery and collection app built using Kotlin and Jetpack Compose.
The app focuses on clean UI, smooth user experience, and demonstrates effective use of AI tools throughout the development process.

This project was built as part of an AI-tool proficiency assignment, emphasizing how AI can accelerate development, debugging, and UI refinement.

🚀 Features Implemented
✅ Authentication & User Flow

Login screen with session-based state

App starts with login screen and navigates to main app after login
(Local/in-memory auth for demo purposes)

✅ Quote Browsing & Discovery

Home feed displaying quotes

“Quote of the Day” (changes daily using date-based logic)

Search quotes by text or author

Clean loading and empty states

100+ quotes can be easily seeded (sample data included)

✅ Favorites

Add/remove quotes to favorites

Dedicated Favorites screen

Favorites persist across screens using a single repository (single source of truth)

✅ Sharing

Share quotes as text using Android system share sheet

Works with WhatsApp, Instagram, etc.

✅ UI & UX

Built entirely with Jetpack Compose (Material 3)

Polished green 💚 & white 🤍 theme

Rounded cards, elevation, spacing polish

Bottom navigation (Home / Favorites)

Clean empty states and hierarchy

🛠️ Tech Stack
Layer	Technology
Language	Kotlin
UI	Jetpack Compose (Material 3)
Architecture	Repository pattern
State	Compose state
Navigation	Scaffold + Bottom Navigation
Minimum SDK	24
📂 Project Structure
com.example.quotevault
│
├── data
│   ├── QuoteRepository.kt
│   └── DailyQuoteManager.kt
│
├── model
│   └── Quote.kt
│
├── ui
│   ├── auth
│   │   └── LoginScreen.kt
│   ├── home
│   │   ├── HomeScreen.kt
│   │   └── QuoteScreen.kt
│   ├── favorites
│   │   └── FavoritesScreen.kt
│   └── theme
│       ├── Color.kt
│       └── Theme.kt
│
└── MainActivity.kt

⚙️ Setup Instructions
Prerequisites

Android Studio (latest stable)

JDK 17+

Android SDK (API 24+)

Steps

Clone the repository:

git clone https://github.com/ankita8317/QuoteVault.git


Open the project in Android Studio

Let Gradle sync

Run on emulator or physical device

🔐 Supabase Configuration (Planned)

Supabase was part of the original assignment requirements.

In this implementation:

Authentication and data are handled locally to ensure stability and avoid setup complexity.

Supabase integration can be added by:

Creating a Supabase project

Adding SUPABASE_URL and SUPABASE_ANON_KEY

Replacing QuoteRepository with Supabase-backed data sources

This decision allowed focus on core UX and AI-assisted development.

🤖 AI Coding Approach & Workflow

AI tools were used extensively and transparently during development.

How AI Was Used

Generating Jetpack Compose UI layouts

Debugging Compose state issues

Fixing Gradle and dependency conflicts

Refactoring code into clean architecture

Improving UI polish and consistency

Explaining errors and suggesting fixes in real time

Workflow

Feature planning with AI

Code generation using AI tools

Manual review and adjustment

Debugging errors with AI guidance

UI polish and cleanup

🧠 AI Tools Used

ChatGPT – architecture, debugging, UI polish, explanations

Cursor AI – code generation, refactoring, error fixing

Android Studio AI tools – previews and inspections

AI was used to accelerate development, while final decisions and structure were made manually.

🎨 Design Process

Initial UI concepts generated using AI-based design suggestions

Green & white theme chosen for calm and consistency

UI refined directly in Jetpack Compose using previews

Focus on spacing, typography, and visual hierarchy

(Figma/Stitch designs were conceptual and translated directly into Compose components.)

⚠️ Known Limitations

Authentication is local (not backend-backed)

Favorites are stored in-memory (not cloud synced)

No widget implemented

No push notifications

Share card image generation not implemented (text share only)

These trade-offs were intentional to ensure stability and polish of core features.

🌱 Future Improvements

Supabase authentication and cloud sync

Push notifications for daily quotes

Home screen widget

Image-based share cards

User profile & settings persistence
