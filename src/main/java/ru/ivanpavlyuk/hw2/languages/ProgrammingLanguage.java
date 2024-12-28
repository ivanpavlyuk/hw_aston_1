package ru.ivanpavlyuk.hw2.languages;

abstract class ProgrammingLanguage {
    private String name;

    public ProgrammingLanguage(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void describe();
}

abstract class ProceduralLanguage extends ProgrammingLanguage {
    public ProceduralLanguage(String name) {
        super(name);
    }
}

abstract class NonProceduralLanguage extends ProgrammingLanguage {
    public NonProceduralLanguage(String name) {
        super(name);
    }
}

class LowLevelLanguage extends ProceduralLanguage {
    public LowLevelLanguage(String name) {
        super(name);
    }

    @Override
    public void describe() {
        System.out.println(getName() + " is a low-level, machine-dependent language.");
    }
}

class HighLevelLanguage extends ProceduralLanguage {
    public HighLevelLanguage(String name) {
        super(name);
    }

    @Override
    public void describe() {
        System.out.println(getName() + " is a high-level, machine-independent language.");
    }
}

class ObjectOrientedLanguage extends NonProceduralLanguage {
    public ObjectOrientedLanguage(String name) {
        super(name);
    }

    @Override
    public void describe() {
        System.out.println(getName() + " is an object-oriented language.");
    }
}

abstract class DeclarativeLanguage extends NonProceduralLanguage {
    public DeclarativeLanguage(String name) {
        super(name);
    }
}

class LogicLanguage extends DeclarativeLanguage {
    public LogicLanguage(String name) {
        super(name);
    }

    @Override
    public void describe() {
        System.out.println(getName() + " is a logical programming language.");
    }
}

class FunctionalLanguage extends DeclarativeLanguage {
    public FunctionalLanguage(String name) {
        super(name);
    }

    @Override
    public void describe() {
        System.out.println(getName() + " is a functional programming language.");
    }
}

