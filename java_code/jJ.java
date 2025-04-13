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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class jJ
extends GeneratedMessageV3
implements jM {
    private static final long c = 0L;
    public static final int a = 1;
    List<jG> d;
    private byte e = (byte)-1;
    private static final jJ f = new jJ();
    @Deprecated
    public static final Parser<jJ> b = new jK();

    jJ(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private jJ() {
        this.d = Collections.emptyList();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    jJ(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                    case 10: 
                }
                if (!(bl & true)) {
                    this.d = new ArrayList<jG>();
                    bl |= true;
                }
                this.d.add((jG)codedInputStream.readMessage(jG.b, extensionRegistryLite));
            }
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw invalidProtocolBufferException.setUnfinishedMessage((MessageLite)this);
        }
        catch (IOException iOException) {
            throw new InvalidProtocolBufferException(iOException).setUnfinishedMessage((MessageLite)this);
        }
        finally {
            if (bl & true) {
                this.d = Collections.unmodifiableList(this.d);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor a() {
        return jE.c;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return jE.d.ensureFieldAccessorsInitialized(jJ.class, jL.class);
    }

    @Override
    public List<jG> b() {
        return this.d;
    }

    @Override
    public List<? extends jN> c() {
        return this.d;
    }

    @Override
    public int d() {
        return this.d.size();
    }

    @Override
    public jG a(int n) {
        return this.d.get(n);
    }

    @Override
    public jN b(int n) {
        return this.d.get(n);
    }

    public final boolean isInitialized() {
        byte by = this.e;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        for (int k = 0; k < this.d(); ++k) {
            if (this.a(k).isInitialized()) continue;
            this.e = 0;
            return false;
        }
        this.e = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        for (int k = 0; k < this.d.size(); ++k) {
            codedOutputStream.writeMessage(1, (MessageLite)this.d.get(k));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        for (int k = 0; k < this.d.size(); ++k) {
            n += CodedOutputStream.computeMessageSize((int)1, (MessageLite)((MessageLite)this.d.get(k)));
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof jJ)) {
            return super.equals(object);
        }
        jJ jJ2 = (jJ)object;
        boolean bl = true;
        bl = bl && this.b().equals(jJ2.b());
        bl = bl && this.unknownFields.equals((Object)jJ2.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + jJ.a().hashCode();
        if (this.d() > 0) {
            n = 37 * n + 1;
            n = 53 * n + this.b().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static jJ a(ByteBuffer byteBuffer) {
        return (jJ)b.parseFrom(byteBuffer);
    }

    public static jJ a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (jJ)b.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static jJ a(ByteString byteString) {
        return (jJ)b.parseFrom(byteString);
    }

    public static jJ a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (jJ)b.parseFrom(byteString, extensionRegistryLite);
    }

    public static jJ a(byte[] byArray) {
        return (jJ)b.parseFrom(byArray);
    }

    public static jJ a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (jJ)b.parseFrom(byArray, extensionRegistryLite);
    }

    public static jJ a(InputStream inputStream) {
        return (jJ)GeneratedMessageV3.parseWithIOException(b, (InputStream)inputStream);
    }

    public static jJ a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (jJ)GeneratedMessageV3.parseWithIOException(b, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static jJ b(InputStream inputStream) {
        return (jJ)GeneratedMessageV3.parseDelimitedWithIOException(b, (InputStream)inputStream);
    }

    public static jJ b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (jJ)GeneratedMessageV3.parseDelimitedWithIOException(b, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static jJ a(CodedInputStream codedInputStream) {
        return (jJ)GeneratedMessageV3.parseWithIOException(b, (CodedInputStream)codedInputStream);
    }

    public static jJ a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (jJ)GeneratedMessageV3.parseWithIOException(b, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public jL e() {
        return jJ.f();
    }

    public static jL f() {
        return f.g();
    }

    public static jL a(jJ jJ2) {
        return f.g().a(jJ2);
    }

    public jL g() {
        return this == f ? new jL() : new jL().a(this);
    }

    protected jL a(GeneratedMessageV3.BuilderParent builderParent) {
        jL jL2 = new jL(builderParent);
        return jL2;
    }

    public static jJ h() {
        return f;
    }

    public static Parser<jJ> i() {
        return b;
    }

    public Parser<jJ> getParserForType() {
        return b;
    }

    public jJ j() {
        return f;
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

    static /* synthetic */ boolean l() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(jJ jJ2) {
        return jJ2.unknownFields;
    }
}

