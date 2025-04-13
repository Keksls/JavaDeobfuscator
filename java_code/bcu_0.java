/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.MessageLite
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.MessageToMessageDecoder
 *  org.apache.log4j.Logger
 */
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;
import java.util.List;
import java.util.Optional;
import org.apache.log4j.Logger;

/*
 * Renamed from bcu
 */
public class bcu_0
extends MessageToMessageDecoder<ar_2> {
    private static final Logger a = Logger.getLogger(bcu_0.class);

    protected void a(ChannelHandlerContext channelHandlerContext, ar_2 ar_22, List<Object> list) {
        try {
            bcu_0.a(ar_22, list);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            a.error((Object)"[CHAT] Error when decoding message", (Throwable)invalidProtocolBufferException);
        }
    }

    private static void a(ar_2 ar_22, List<Object> list) {
        if (ar_22.f()) {
            ad_1 ad_12 = ar_22.g();
            av_2 av_22 = ad_12.f();
            if (ad_12.d() == ag_1.b) {
                bcu_0.a(av_22, list);
            } else {
                a.info((Object)String.format("[CHAT] Error %s when receiving response to message id=%d", new Object[]{ad_12.d(), ad_12.b()}));
            }
        } else if (ar_22.i()) {
            bcu_0.a(ar_22.j(), list);
        }
    }

    private static void a(av_2 av_22, List<Object> list) {
        if (av_22.b() == 0) {
            return;
        }
        Optional<MessageLite> optional = am_2.a(av_22.b());
        if (optional.isEmpty()) {
            a.error((Object)("[CHAT] Unknown proto for id = " + av_22.b()));
            return;
        }
        MessageLite messageLite = (MessageLite)optional.get().getParserForType().parseFrom(av_22.c());
        list.add(messageLite);
    }

    protected /* synthetic */ void decode(ChannelHandlerContext channelHandlerContext, Object object, List list) {
        this.a(channelHandlerContext, (ar_2)object, list);
    }
}

