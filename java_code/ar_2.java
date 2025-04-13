/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.CodedOutputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.Parser
 *  com.google.protobuf.UnknownFieldSet
 *  com.google.protobuf.UnknownFieldSet$Builder
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/*
 * Renamed from ar
 */
public final class ar_2
extends GeneratedMessageV3
implements aj_2 {
    private static final long d = 0L;
    int e = 0;
    Object f;
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 3;
    private byte g = (byte)-1;
    private static final ar_2 h = new ar_2();
    static final Parser<ar_2> i = new as_1();

    ar_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private ar_2() {
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    ar_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block12: while (!bl2) {
                GeneratedMessageV3.Builder builder2;
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block12;
                    }
                    default: {
                        if (this.parseUnknownFieldProto3(codedInputStream, builder, extensionRegistryLite, n)) continue block12;
                        bl2 = true;
                        continue block12;
                    }
                    case 10: {
                        builder2 = null;
                        if (this.e == 1) {
                            builder2 = ((az_1)this.f).h();
                        }
                        this.f = codedInputStream.readMessage(az_1.j(), extensionRegistryLite);
                        if (builder2 != null) {
                            builder2.a((az_1)this.f);
                            this.f = builder2.i();
                        }
                        this.e = 1;
                        continue block12;
                    }
                    case 18: {
                        builder2 = null;
                        if (this.e == 2) {
                            builder2 = ((ad_1)this.f).j();
                        }
                        this.f = codedInputStream.readMessage(ad_1.l(), extensionRegistryLite);
                        if (builder2 != null) {
                            builder2.a((ad_1)this.f);
                            this.f = builder2.k();
                        }
                        this.e = 2;
                        continue block12;
                    }
                    case 26: 
                }
                builder2 = null;
                if (this.e == 3) {
                    builder2 = ((av_2)this.f).f();
                }
                this.f = codedInputStream.readMessage(av_2.h(), extensionRegistryLite);
                if (builder2 != null) {
                    builder2.a((av_2)this.f);
                    this.f = builder2.g();
                }
                this.e = 3;
            }
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw invalidProtocolBufferException.setUnfinishedMessage((MessageLite)this);
        }
        catch (IOException iOException) {
            throw new InvalidProtocolBufferException(iOException).setUnfinishedMessage((MessageLite)this);
        }
        finally {
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor a() {
        return ao_2.a;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ao_2.b.ensureFieldAccessorsInitialized(ar_2.class, at_1.class);
    }

    @Override
    public au_2 b() {
        return au_2.b(this.e);
    }

    @Override
    public boolean c() {
        return this.e == 1;
    }

    @Override
    public az_1 d() {
        if (this.e == 1) {
            return (az_1)this.f;
        }
        return az_1.i();
    }

    @Override
    public ac_2 e() {
        if (this.e == 1) {
            return (az_1)this.f;
        }
        return az_1.i();
    }

    @Override
    public boolean f() {
        return this.e == 2;
    }

    @Override
    public ad_1 g() {
        if (this.e == 2) {
            return (ad_1)this.f;
        }
        return ad_1.k();
    }

    @Override
    public ai_1 h() {
        if (this.e == 2) {
            return (ad_1)this.f;
        }
        return ad_1.k();
    }

    @Override
    public boolean i() {
        return this.e == 3;
    }

    @Override
    public av_2 j() {
        if (this.e == 3) {
            return (av_2)this.f;
        }
        return av_2.g();
    }

    @Override
    public ay_2 k() {
        if (this.e == 3) {
            return (av_2)this.f;
        }
        return av_2.g();
    }

    public final boolean isInitialized() {
        byte by = this.g;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        this.g = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if (this.e == 1) {
            codedOutputStream.writeMessage(1, (MessageLite)((az_1)this.f));
        }
        if (this.e == 2) {
            codedOutputStream.writeMessage(2, (MessageLite)((ad_1)this.f));
        }
        if (this.e == 3) {
            codedOutputStream.writeMessage(3, (MessageLite)((av_2)this.f));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if (this.e == 1) {
            n += CodedOutputStream.computeMessageSize((int)1, (MessageLite)((az_1)this.f));
        }
        if (this.e == 2) {
            n += CodedOutputStream.computeMessageSize((int)2, (MessageLite)((ad_1)this.f));
        }
        if (this.e == 3) {
            n += CodedOutputStream.computeMessageSize((int)3, (MessageLite)((av_2)this.f));
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ar_2)) {
            return super.equals(object);
        }
        ar_2 ar_22 = (ar_2)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b().equals((Object)ar_22.b());
        if (!bl) {
            return false;
        }
        switch (this.e) {
            case 1: {
                bl = bl && this.d().equals(ar_22.d());
                break;
            }
            case 2: {
                bl = bl && this.g().equals(ar_22.g());
                break;
            }
            case 3: {
                bl = bl && this.j().equals(ar_22.j());
                break;
            }
        }
        bl = bl && this.unknownFields.equals((Object)ar_22.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + ar_2.a().hashCode();
        switch (this.e) {
            case 1: {
                n = 37 * n + 1;
                n = 53 * n + this.d().hashCode();
                break;
            }
            case 2: {
                n = 37 * n + 2;
                n = 53 * n + this.g().hashCode();
                break;
            }
            case 3: {
                n = 37 * n + 3;
                n = 53 * n + this.j().hashCode();
                break;
            }
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static ar_2 a(ByteBuffer byteBuffer) {
        return (ar_2)i.parseFrom(byteBuffer);
    }

    public static ar_2 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ar_2)i.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ar_2 a(ByteString byteString) {
        return (ar_2)i.parseFrom(byteString);
    }

    public static ar_2 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (ar_2)i.parseFrom(byteString, extensionRegistryLite);
    }

    public static ar_2 a(byte[] byArray) {
        return (ar_2)i.parseFrom(byArray);
    }

    public static ar_2 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (ar_2)i.parseFrom(byArray, extensionRegistryLite);
    }

    public static ar_2 a(InputStream inputStream) {
        return (ar_2)GeneratedMessageV3.parseWithIOException(i, (InputStream)inputStream);
    }

    public static ar_2 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ar_2)GeneratedMessageV3.parseWithIOException(i, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ar_2 b(InputStream inputStream) {
        return (ar_2)GeneratedMessageV3.parseDelimitedWithIOException(i, (InputStream)inputStream);
    }

    public static ar_2 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ar_2)GeneratedMessageV3.parseDelimitedWithIOException(i, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ar_2 a(CodedInputStream codedInputStream) {
        return (ar_2)GeneratedMessageV3.parseWithIOException(i, (CodedInputStream)codedInputStream);
    }

    public static ar_2 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ar_2)GeneratedMessageV3.parseWithIOException(i, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public at_1 l() {
        return ar_2.m();
    }

    public static at_1 m() {
        return h.n();
    }

    public static at_1 a(ar_2 ar_22) {
        return h.n().a(ar_22);
    }

    public at_1 n() {
        return this == h ? new at_1() : new at_1().a(this);
    }

    protected at_1 a(GeneratedMessageV3.BuilderParent builderParent) {
        at_1 at_12 = new at_1(builderParent);
        return at_12;
    }

    public static ar_2 o() {
        return h;
    }

    public static Parser<ar_2> p() {
        return i;
    }

    public Parser<ar_2> getParserForType() {
        return i;
    }

    public ar_2 q() {
        return h;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.n();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.l();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.n();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.l();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.q();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.q();
    }

    static /* synthetic */ boolean r() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(ar_2 ar_22) {
        return ar_22.unknownFields;
    }
}

