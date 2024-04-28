cmake_minimum_required(VERSION 3.5)

project(辰星故国 LANGUAGES CXX)

set(CMAKE_CXX_STANDARD 20)
set(CMAKE_CXX_STANDARD_REQUIRED ON)

set(CSE_DIRECTORY "E:/Projects/Qt/CSE-Build/Install")

file(GLOB_RECURSE Files "${CMAKE_CURRENT_SOURCE_DIR}/Src/Main/Cxx/*.cc")
foreach(File IN LISTS Files)
    get_filename_component(Name ${File} NAME_WE)
    add_executable(${Name} ${File})

    include_directories(${Name} PUBLIC ${CSE_DIRECTORY}/Headers)
    target_link_directories(${Name} PUBLIC ${CSE_DIRECTORY}/Libraries)

    target_link_libraries(${Name} PUBLIC CSE_MathExtras_Sexagesimal)
    target_link_libraries(${Name} PUBLIC CSE_Parser)
    target_link_libraries(${Name} PUBLIC CSE_Base)

    include(GNUInstallDirs)
    install(TARGETS ${Name}
        LIBRARY DESTINATION ${CMAKE_INSTALL_LIBDIR}
        RUNTIME DESTINATION ${CMAKE_INSTALL_BINDIR}
    )
endforeach()
