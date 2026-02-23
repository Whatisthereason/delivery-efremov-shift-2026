# Delivery Application --- Android

Kotlin + Jetpack Compose application built with layered Clean
Architecture and real REST backend integration ( https://shift-intensive.ru/api ).

## Architecture

ui → presentation → domain → data

-   **Data**: Retrofit, OkHttp, kotlinx.serialization, DTO→Domain
    mapping, error abstraction\
-   **Domain**: Pure Kotlin models, repository interfaces, no Android
    dependencies\
-   **Presentation**: ViewModel + StateFlow, immutable state, sealed
    errors, validation\
-   **UI**: Stateless Compose, state-driven rendering

## Implemented

-   Delivery points & package types loading\
-   Delivery cost calculation (POST /delivery/calc)\
-   Multi-step order flow\
-   Structured input validation\
-   Network / validation error separation\
-   In-memory order draft

## Technical Approach

-   Manual dependency injection\
-   Unidirectional data flow\
-   Strict separation of concerns\
-   Domain isolated from Android & network layers

## Stack

Kotlin · Compose · Coroutines · StateFlow · ViewModel · Retrofit ·
OkHttp · kotlinx.serialization · Navigation Compose .
