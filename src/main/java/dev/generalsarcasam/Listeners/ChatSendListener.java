package dev.generalsarcasam.Listeners;

import io.papermc.paper.event.player.AsyncChatEvent;
import net.kyori.adventure.text.format.TextColor;
import net.kyori.adventure.text.minimessage.MiniMessage;
import net.kyori.adventure.text.minimessage.Template;
import net.kyori.adventure.text.serializer.plain.PlainComponentSerializer;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;

public class ChatSendListener implements Listener {

    private static final PlainComponentSerializer PLAIN = PlainComponentSerializer.plain();
    private static final MiniMessage MINI = MiniMessage.get();
    private static final String EXAMPLE = "<name>: <message>";

    @EventHandler(priority = EventPriority.NORMAL)
    public void onAsyncChatEvent(AsyncChatEvent event) {
        event.formatter((name, sentMessage) -> {
            Template player = Template.of("name", name.color(TextColor.color(0xf5a5a5)));
            Template message = Template.of("message", sentMessage);

            return MINI.parse(EXAMPLE, player, message);
        });



    //todo: CONSOLE LOGGING WITH FORMATTER?

    }
}
