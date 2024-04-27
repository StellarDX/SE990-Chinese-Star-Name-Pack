cmake_minimum_required(VERSION 3.5)

project(辰星故国 LANGUAGES CXX)

set(CMAKE_CXX_STANDARD 20)
set(CMAKE_CXX_STANDARD_REQUIRED ON)

file(GLOB_RECURSE Files RELATIVE "${CMAKE_CURRENT_SOURCE_DIR}" "${CMAKE_CURRENT_SOURCE_DIR}/*.cc")
foreach(File IN LISTS Files)
    get_filename_component(Name ${File} NAME_WE)
    add_executable(${Name} ${File})
endforeach()

set(CSE_DIRECTORY "E:/Projects/Qt/CSE-Build/Install")

include_directories(SimbadOutputParser PUBLIC ${CSE_DIRECTORY}/Headers)
target_link_directories(SimbadOutputParser PUBLIC ${CSE_DIRECTORY}/Libraries)

target_link_libraries(SimbadOutputParser PUBLIC CSE_MathExtras_Sexagesimal)
target_link_libraries(SimbadOutputParser PUBLIC CSE_Parser)
target_link_libraries(SimbadOutputParser PUBLIC CSE_Base)

include(GNUInstallDirs)
install(TARGETS SimbadOutputParser
    LIBRARY DESTINATION ${CMAKE_INSTALL_LIBDIR}
    RUNTIME DESTINATION ${CMAKE_INSTALL_BINDIR}
)
