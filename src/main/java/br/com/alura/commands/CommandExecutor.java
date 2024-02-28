package br.com.alura.commands;

import org.jetbrains.annotations.NotNull;

public class CommandExecutor {

    public void executeCommand(@NotNull Command command) {
        command.execute();
    }

}
