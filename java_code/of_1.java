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
 * Renamed from of
 */
public final class of_1
extends GeneratedMessageV3
implements oi_1 {
    private static final long c = 0L;
    int d;
    public static final int a = 2;
    long e;
    private byte f = (byte)-1;
    private static final of_1 g = new of_1();
    @Deprecated
    public static final Parser<of_1> b = new og_1();

    of_1(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private of_1() {
        this.e = 0L;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    of_1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                    case 16: 
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
        return nz_0.g;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return nz_0.h.ensureFieldAccessorsInitialized(of_1.class, oh_1.class);
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
            codedOutputStream.writeInt64(2, this.e);
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
            n += CodedOutputStream.computeInt64Size((int)2, (long)this.e);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof of_1)) {
            return super.equals(object);
        }
        of_1 of_12 = (of_1)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == of_12.b();
        if (this.b()) {
            bl = bl && this.c() == of_12.c();
        }
        bl = bl && this.unknownFields.equals((Object)of_12.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + of_1.a().hashCode();
        if (this.b()) {
            n = 37 * n + 2;
            n = 53 * n + Internal.hashLong((long)this.c());
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static of_1 a(ByteBuffer byteBuffer) {
        return (of_1)b.parseFrom(byteBuffer);
    }

    public static of_1 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (of_1)b.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static of_1 a(ByteString byteString) {
        return (of_1)b.parseFrom(byteString);
    }

    public static of_1 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (of_1)b.parseFrom(byteString, extensionRegistryLite);
    }

    public static of_1 a(byte[] byArray) {
        return (of_1)b.parseFrom(byArray);
    }

    public static of_1 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (of_1)b.parseFrom(byArray, extensionRegistryLite);
    }

    public static of_1 a(InputStream inputStream) {
        return (of_1)GeneratedMessageV3.parseWithIOException(b, (InputStream)inputStream);
    }

    public static of_1 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (of_1)GeneratedMessageV3.parseWithIOException(b, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static of_1 b(InputStream inputStream) {
        return (of_1)GeneratedMessageV3.parseDelimitedWithIOException(b, (InputStream)inputStream);
    }

    public static of_1 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (of_1)GeneratedMessageV3.parseDelimitedWithIOException(b, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static of_1 a(CodedInputStream codedInputStream) {
        return (of_1)GeneratedMessageV3.parseWithIOException(b, (CodedInputStream)codedInputStream);
    }

    public static of_1 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (of_1)GeneratedMessageV3.parseWithIOException(b, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public oh_1 d() {
        return of_1.e();
    }

    public static oh_1 e() {
        return g.f();
    }

    public static oh_1 a(of_1 of_12) {
        return g.f().a(of_12);
    }

    public oh_1 f() {
        return this == g ? new oh_1() : new oh_1().a(this);
    }

    protected oh_1 a(GeneratedMessageV3.BuilderParent builderParent) {
        oh_1 oh_12 = new oh_1(builderParent);
        return oh_12;
    }

    public static of_1 g() {
        return g;
    }

    public static Parser<of_1> h() {
        return b;
    }

    public Parser<of_1> getParserForType() {
        return b;
    }

    public of_1 i() {
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

    static /* synthetic */ UnknownFieldSet b(of_1 of_12) {
        return of_12.unknownFields;
    }
}

