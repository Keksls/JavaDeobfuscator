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

public final class la
extends GeneratedMessageV3
implements ld_0 {
    private static final long c = 0L;
    int d;
    public static final int a = 1;
    long e;
    private byte f = (byte)-1;
    private static final la g = new la();
    @Deprecated
    public static final Parser<la> b = new lb();

    la(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private la() {
        this.e = 0L;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    la(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                        if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue block10;
                        bl2 = true;
                        continue block10;
                    }
                    case 8: 
                }
                this.d |= 1;
                this.e = codedInputStream.readInt64();
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
        return kM.m;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return kM.n.ensureFieldAccessorsInitialized(la.class, lc.class);
    }

    @Override
    public boolean b() {
        return (this.d & 1) == 1;
    }

    @Override
    public long c() {
        return this.e;
    }

    public final boolean isInitialized() {
        byte by = this.f;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.b()) {
            this.f = 0;
            return false;
        }
        this.f = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.d & 1) == 1) {
            codedOutputStream.writeInt64(1, this.e);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if ((this.d & 1) == 1) {
            n += CodedOutputStream.computeInt64Size((int)1, (long)this.e);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof la)) {
            return super.equals(object);
        }
        la la2 = (la)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == la2.b();
        if (this.b()) {
            bl = bl && this.c() == la2.c();
        }
        bl = bl && this.unknownFields.equals((Object)la2.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + la.a().hashCode();
        if (this.b()) {
            n = 37 * n + 1;
            n = 53 * n + Internal.hashLong((long)this.c());
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static la a(ByteBuffer byteBuffer) {
        return (la)b.parseFrom(byteBuffer);
    }

    public static la a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (la)b.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static la a(ByteString byteString) {
        return (la)b.parseFrom(byteString);
    }

    public static la a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (la)b.parseFrom(byteString, extensionRegistryLite);
    }

    public static la a(byte[] byArray) {
        return (la)b.parseFrom(byArray);
    }

    public static la a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (la)b.parseFrom(byArray, extensionRegistryLite);
    }

    public static la a(InputStream inputStream) {
        return (la)GeneratedMessageV3.parseWithIOException(b, (InputStream)inputStream);
    }

    public static la a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (la)GeneratedMessageV3.parseWithIOException(b, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static la b(InputStream inputStream) {
        return (la)GeneratedMessageV3.parseDelimitedWithIOException(b, (InputStream)inputStream);
    }

    public static la b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (la)GeneratedMessageV3.parseDelimitedWithIOException(b, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static la a(CodedInputStream codedInputStream) {
        return (la)GeneratedMessageV3.parseWithIOException(b, (CodedInputStream)codedInputStream);
    }

    public static la a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (la)GeneratedMessageV3.parseWithIOException(b, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public lc d() {
        return la.e();
    }

    public static lc e() {
        return g.f();
    }

    public static lc a(la la2) {
        return g.f().a(la2);
    }

    public lc f() {
        return this == g ? new lc() : new lc().a(this);
    }

    protected lc a(GeneratedMessageV3.BuilderParent builderParent) {
        lc lc2 = new lc(builderParent);
        return lc2;
    }

    public static la g() {
        return g;
    }

    public static Parser<la> h() {
        return b;
    }

    public Parser<la> getParserForType() {
        return b;
    }

    public la i() {
        return g;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.f();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.d();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.f();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.d();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.i();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.i();
    }

    static /* synthetic */ boolean j() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(la la2) {
        return la2.unknownFields;
    }
}

