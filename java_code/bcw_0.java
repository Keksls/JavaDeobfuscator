/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.MessageToMessageEncoder
 */
import com.google.gson.Gson;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageEncoder;
import java.nio.charset.StandardCharsets;
import java.util.List;

/*
 * Renamed from bcw
 */
public class bcw_0
extends MessageToMessageEncoder<bcN> {
    protected void a(ChannelHandlerContext channelHandlerContext, bcN bcN2, List<Object> list) {
        String string = new Gson().toJson((Object)bcN2);
        byte[] byArray = string.getBytes(StandardCharsets.UTF_8);
        bcR bcR2 = new bcR(0);
        bcR2.a(byArray);
        list.add(bcR2);
    }

    protected /* synthetic */ void encode(ChannelHandlerContext channelHandlerContext, Object object, List list) {
        this.a(channelHandlerContext, (bcN)object, list);
    }
}

