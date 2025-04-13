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
 *  com.google.protobuf.Internal
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
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/*
 * Renamed from bR
 */
public final class br_2
extends GeneratedMessageV3
implements bu_1 {
    private static final long c = 0L;
    public static final int a = 1;
    long d;
    public static final int b = 2;
    bg_2 e;
    private byte f = (byte)-1;
    private static final br_2 g = new br_2();
    static final Parser<br_2> h = new bs_2();

    br_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private br_2() {
        this.d = 0L;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    br_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block11: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block11;
                    }
                    default: {
                        if (this.parseUnknownFieldProto3(codedInputStream, builder, extensionRegistryLite, n)) continue block11;
                        bl2 = true;
                        continue block11;
                    }
                    case 8: {
                        this.d = codedInputStream.readInt64();
                        continue block11;
                    }
                    case 18: 
                }
                bi_2 bi_22 = null;
                if (this.e != null) {
                    bi_22 = this.e.j();
                }
                this.e = (bg_2)codedInputStream.readMessage(bg_2.l(), extensionRegistryLite);
                if (bi_22 == null) continue;
                bi_22.a(this.e);
                this.e = bi_22.j();
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
        return ak_2.c;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ak_2.d.ensureFieldAccessorsInitialized(br_2.class, bt_1.class);
    }

    @Override
    public long b() {
        return this.d;
    }

    @Override
    public boolean c() {
        return this.e != null;
    }

    @Override
    public bg_2 d() {
        return this.e == null ? bg_2.k() : this.e;
    }

    @Override
    public bk_2 e() {
        return this.d();
    }

    public final boolean isInitialized() {
        byte by = this.f;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        this.f = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if (this.d != 0L) {
            codedOutputStream.writeInt64(1, this.d);
        }
        if (this.e != null) {
            codedOutputStream.writeMessage(2, (MessageLite)this.d());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if (this.d != 0L) {
            n += CodedOutputStream.computeInt64Size((int)1, (long)this.d);
        }
        if (this.e != null) {
            n += CodedOutputStream.computeMessageSize((int)2, (MessageLite)this.d());
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof br_2)) {
            return super.equals(object);
        }
        br_2 br_22 = (br_2)object;
        boolean bl = true;
        bl = bl && this.b() == br_22.b();
        boolean bl2 = bl = bl && this.c() == br_22.c();
        if (this.c()) {
            bl = bl && this.d().equals(br_22.d());
        }
        bl = bl && this.unknownFields.equals((Object)br_22.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + br_2.a().hashCode();
        n = 37 * n + 1;
        n = 53 * n + Internal.hashLong((long)this.b());
        if (this.c()) {
            n = 37 * n + 2;
            n = 53 * n + this.d().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static br_2 a(ByteBuffer byteBuffer) {
        return (br_2)h.parseFrom(byteBuffer);
    }

    public static br_2 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (br_2)h.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static br_2 a(ByteString byteString) {
        return (br_2)h.parseFrom(byteString);
    }

    public static br_2 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (br_2)h.parseFrom(byteString, extensionRegistryLite);
    }

    public static br_2 a(byte[] byArray) {
        return (br_2)h.parseFrom(byArray);
    }

    public static br_2 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (br_2)h.parseFrom(byArray, extensionRegistryLite);
    }

    public static br_2 a(InputStream inputStream) {
        return (br_2)GeneratedMessageV3.parseWithIOException(h, (InputStream)inputStream);
    }

    public static br_2 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (br_2)GeneratedMessageV3.parseWithIOException(h, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static br_2 b(InputStream inputStream) {
        return (br_2)GeneratedMessageV3.parseDelimitedWithIOException(h, (InputStream)inputStream);
    }

    public static br_2 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (br_2)GeneratedMessageV3.parseDelimitedWithIOException(h, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static br_2 a(CodedInputStream codedInputStream) {
        return (br_2)GeneratedMessageV3.parseWithIOException(h, (CodedInputStream)codedInputStream);
    }

    public static br_2 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (br_2)GeneratedMessageV3.parseWithIOException(h, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public bt_1 f() {
        return br_2.g();
    }

    public static bt_1 g() {
        return g.h();
    }

    public static bt_1 a(br_2 br_22) {
        return g.h().a(br_22);
    }

    public bt_1 h() {
        return this == g ? new bt_1() : new bt_1().a(this);
    }

    protected bt_1 a(GeneratedMessageV3.BuilderParent builderParent) {
        bt_1 bt_12 = new bt_1(builderParent);
        return bt_12;
    }

    public static br_2 i() {
        return g;
    }

    public static Parser<br_2> j() {
        return h;
    }

    public Parser<br_2> getParserForType() {
        return h;
    }

    public br_2 k() {
        return g;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.h();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.f();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.h();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.f();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.k();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.k();
    }

    static /* synthetic */ boolean l() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(br_2 br_22) {
        return br_22.unknownFields;
    }
}

