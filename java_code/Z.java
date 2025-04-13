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

public final class Z
extends GeneratedMessageV3
implements ac_1 {
    private static final long b = 0L;
    public static final int a = 1;
    W c;
    private byte d = (byte)-1;
    private static final Z e = new Z();
    static final Parser<Z> f = new aa_1();

    Z(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private Z() {
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    Z(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block10: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block10;
                    }
                    default: {
                        if (this.parseUnknownFieldProto3(codedInputStream, builder, extensionRegistryLite, n)) continue block10;
                        bl2 = true;
                        continue block10;
                    }
                    case 10: 
                }
                Y y = null;
                if (this.c != null) {
                    y = this.c.j();
                }
                this.c = (W)codedInputStream.readMessage(W.l(), extensionRegistryLite);
                if (y == null) continue;
                y.a(this.c);
                this.c = y.k();
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
        return e_0.g;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return e_0.h.ensureFieldAccessorsInitialized(Z.class, ab_1.class);
    }

    @Override
    public boolean b() {
        return this.c != null;
    }

    @Override
    public W c() {
        return this.c == null ? W.k() : this.c;
    }

    @Override
    public al_1 d() {
        return this.c();
    }

    public final boolean isInitialized() {
        byte by = this.d;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        this.d = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if (this.c != null) {
            codedOutputStream.writeMessage(1, (MessageLite)this.c());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if (this.c != null) {
            n += CodedOutputStream.computeMessageSize((int)1, (MessageLite)this.c());
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof Z)) {
            return super.equals(object);
        }
        Z z = (Z)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == z.b();
        if (this.b()) {
            bl = bl && this.c().equals(z.c());
        }
        bl = bl && this.unknownFields.equals((Object)z.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + Z.a().hashCode();
        if (this.b()) {
            n = 37 * n + 1;
            n = 53 * n + this.c().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static Z a(ByteBuffer byteBuffer) {
        return (Z)f.parseFrom(byteBuffer);
    }

    public static Z a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Z)f.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static Z a(ByteString byteString) {
        return (Z)f.parseFrom(byteString);
    }

    public static Z a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Z)f.parseFrom(byteString, extensionRegistryLite);
    }

    public static Z a(byte[] byArray) {
        return (Z)f.parseFrom(byArray);
    }

    public static Z a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (Z)f.parseFrom(byArray, extensionRegistryLite);
    }

    public static Z a(InputStream inputStream) {
        return (Z)GeneratedMessageV3.parseWithIOException(f, (InputStream)inputStream);
    }

    public static Z a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Z)GeneratedMessageV3.parseWithIOException(f, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Z b(InputStream inputStream) {
        return (Z)GeneratedMessageV3.parseDelimitedWithIOException(f, (InputStream)inputStream);
    }

    public static Z b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Z)GeneratedMessageV3.parseDelimitedWithIOException(f, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static Z a(CodedInputStream codedInputStream) {
        return (Z)GeneratedMessageV3.parseWithIOException(f, (CodedInputStream)codedInputStream);
    }

    public static Z a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Z)GeneratedMessageV3.parseWithIOException(f, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public ab_1 e() {
        return Z.f();
    }

    public static ab_1 f() {
        return e.g();
    }

    public static ab_1 a(Z z) {
        return e.g().a(z);
    }

    public ab_1 g() {
        return this == e ? new ab_1() : new ab_1().a(this);
    }

    protected ab_1 a(GeneratedMessageV3.BuilderParent builderParent) {
        ab_1 ab_12 = new ab_1(builderParent);
        return ab_12;
    }

    public static Z h() {
        return e;
    }

    public static Parser<Z> i() {
        return f;
    }

    public Parser<Z> getParserForType() {
        return f;
    }

    public Z j() {
        return e;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.g();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.e();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.g();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.e();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.j();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.j();
    }

    static /* synthetic */ boolean k() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(Z z) {
        return z.unknownFields;
    }
}

