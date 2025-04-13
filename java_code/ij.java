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

public final class ij
extends GeneratedMessageV3
implements im {
    private static final long d = 0L;
    int e;
    public static final int a = 1;
    long f;
    public static final int b = 2;
    int g;
    private byte h = (byte)-1;
    private static final ij i = new ij();
    @Deprecated
    public static final Parser<ij> c = new ik();

    ij(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private ij() {
        this.f = 0L;
        this.g = 0;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    ij(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                        if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue block11;
                        bl2 = true;
                        continue block11;
                    }
                    case 8: {
                        this.e |= 1;
                        this.f = codedInputStream.readInt64();
                        continue block11;
                    }
                    case 16: 
                }
                this.e |= 2;
                this.g = codedInputStream.readInt32();
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
        return hR.c;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return hR.d.ensureFieldAccessorsInitialized(ij.class, il.class);
    }

    @Override
    public boolean b() {
        return (this.e & 1) == 1;
    }

    @Override
    public long c() {
        return this.f;
    }

    @Override
    public boolean d() {
        return (this.e & 2) == 2;
    }

    @Override
    public int e() {
        return this.g;
    }

    public final boolean isInitialized() {
        byte by = this.h;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.b()) {
            this.h = 0;
            return false;
        }
        if (!this.d()) {
            this.h = 0;
            return false;
        }
        this.h = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.e & 1) == 1) {
            codedOutputStream.writeInt64(1, this.f);
        }
        if ((this.e & 2) == 2) {
            codedOutputStream.writeInt32(2, this.g);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if ((this.e & 1) == 1) {
            n += CodedOutputStream.computeInt64Size((int)1, (long)this.f);
        }
        if ((this.e & 2) == 2) {
            n += CodedOutputStream.computeInt32Size((int)2, (int)this.g);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ij)) {
            return super.equals(object);
        }
        ij ij2 = (ij)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == ij2.b();
        if (this.b()) {
            bl = bl && this.c() == ij2.c();
        }
        boolean bl3 = bl = bl && this.d() == ij2.d();
        if (this.d()) {
            bl = bl && this.e() == ij2.e();
        }
        bl = bl && this.unknownFields.equals((Object)ij2.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + ij.a().hashCode();
        if (this.b()) {
            n = 37 * n + 1;
            n = 53 * n + Internal.hashLong((long)this.c());
        }
        if (this.d()) {
            n = 37 * n + 2;
            n = 53 * n + this.e();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static ij a(ByteBuffer byteBuffer) {
        return (ij)c.parseFrom(byteBuffer);
    }

    public static ij a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ij)c.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ij a(ByteString byteString) {
        return (ij)c.parseFrom(byteString);
    }

    public static ij a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (ij)c.parseFrom(byteString, extensionRegistryLite);
    }

    public static ij a(byte[] byArray) {
        return (ij)c.parseFrom(byArray);
    }

    public static ij a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (ij)c.parseFrom(byArray, extensionRegistryLite);
    }

    public static ij a(InputStream inputStream) {
        return (ij)GeneratedMessageV3.parseWithIOException(c, (InputStream)inputStream);
    }

    public static ij a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ij)GeneratedMessageV3.parseWithIOException(c, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ij b(InputStream inputStream) {
        return (ij)GeneratedMessageV3.parseDelimitedWithIOException(c, (InputStream)inputStream);
    }

    public static ij b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ij)GeneratedMessageV3.parseDelimitedWithIOException(c, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ij a(CodedInputStream codedInputStream) {
        return (ij)GeneratedMessageV3.parseWithIOException(c, (CodedInputStream)codedInputStream);
    }

    public static ij a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ij)GeneratedMessageV3.parseWithIOException(c, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public il f() {
        return ij.g();
    }

    public static il g() {
        return i.h();
    }

    public static il a(ij ij2) {
        return i.h().a(ij2);
    }

    public il h() {
        return this == i ? new il() : new il().a(this);
    }

    protected il a(GeneratedMessageV3.BuilderParent builderParent) {
        il il2 = new il(builderParent);
        return il2;
    }

    public static ij i() {
        return i;
    }

    public static Parser<ij> j() {
        return c;
    }

    public Parser<ij> getParserForType() {
        return c;
    }

    public ij k() {
        return i;
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

    static /* synthetic */ UnknownFieldSet b(ij ij2) {
        return ij2.unknownFields;
    }
}

