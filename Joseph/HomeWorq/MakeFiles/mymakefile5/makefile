HEADERS :=$(wildcard header/*.hpp)
SOURCE := src/barevo.cpp
OBJECTS :=$(patsubst src/%.cpp,obj/%.o,$(SOURCE))
EXE :=$(addprefix bin/,program)
CC := g++
BINDIR = bin
OBJDIR = obj
$(EXE) : $(OBJECTS) | $(BINDIR)
	$(CC) $(OBJECTS) -o $(EXE)
$(OBJECTS) : $(SOURCE) $(HEADERS) | $(OBJDIR)
	    $(CC) -c $(SOURCE) -o $(OBJECTS)
$(BINDIR):
	mkdir bin
$(OBJDIR):
	mkdir obj
sss :
	cat src/barev.cpp | sed -e "s/10/100/g" -e "s/"kuku"/"tesar"/g" > src/barevo.cpp
.PHONY : clear
clear :
	rm -r $(OBJDIR) $(BINDIR)
