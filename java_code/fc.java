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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class fc
extends GeneratedMessageV3
implements fj {
    private static final long e = 0L;
    int f;
    public static final int a = 1;
    List<eV> g;
    public static final int b = 2;
    boolean h;
    public static final int c = 3;
    List<eV> i;
    private byte j = (byte)-1;
    private static final fc k = new fc();
    @Deprecated
    public static final Parser<fc> d = new fd();

    fc(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private fc() {
        this.g = Collections.emptyList();
        this.h = true;
        this.i = Collections.emptyList();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    fc(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        int n = 0;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl = false;
            block12: while (!bl) {
                int n2 = codedInputStream.readTag();
                switch (n2) {
                    case 0: {
                        bl = true;
                        continue block12;
                    }
                    default: {
                        if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n2)) continue block12;
                        bl = true;
                        continue block12;
                    }
                    case 10: {
                        if ((n & 1) != 1) {
                            this.g = new ArrayList<eV>();
                            n |= 1;
                        }
                        this.g.add((eV)codedInputStream.readMessage(eV.f, extensionRegistryLite));
                        continue block12;
                    }
                    case 16: {
                        this.f |= 1;
                        this.h = codedInputStream.readBool();
                        continue block12;
                    }
                    case 26: 
                }
                if ((n & 4) != 4) {
                    this.i = new ArrayList<eV>();
                    n |= 4;
                }
                this.i.add((eV)codedInputStream.readMessage(eV.f, extensionRegistryLite));
            }
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw invalidProtocolBufferException.setUnfinishedMessage((MessageLite)this);
        }
        catch (IOException iOException) {
            throw new InvalidProtocolBufferException(iOException).setUnfinishedMessage((MessageLite)this);
        }
        finally {
            if (n & true) {
                this.g = Collections.unmodifiableList(this.g);
            }
            if ((n & 4) == 4) {
                this.i = Collections.unmodifiableList(this.i);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor a() {
        return eT.a;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return eT.b.ensureFieldAccessorsInitialized(fc.class, fe.class);
    }

    @Override
    public List<eV> b() {
        return this.g;
    }

    @Override
    public List<? extends fk> c() {
        return this.g;
    }

    @Override
    public int d() {
        return this.g.size();
    }

    @Override
    public eV a(int n) {
        return this.g.get(n);
    }

    @Override
    public fk b(int n) {
        return this.g.get(n);
    }

    @Override
    public boolean e() {
        return (this.f & 1) == 1;
    }

    @Override
    public boolean f() {
        return this.h;
    }

    @Override
    public List<eV> g() {
        return this.i;
    }

    @Override
    public List<? extends fk> h() {
        return this.i;
    }

    @Override
    public int i() {
        return this.i.size();
    }

    @Override
    public eV c(int n) {
        return this.i.get(n);
    }

    @Override
    public fk d(int n) {
        return this.i.get(n);
    }

    public final boolean isInitialized() {
        int n;
        byte by = this.j;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        for (n = 0; n < this.d(); ++n) {
            if (this.a(n).isInitialized()) continue;
            this.j = 0;
            return false;
        }
        for (n = 0; n < this.i(); ++n) {
            if (this.c(n).isInitialized()) continue;
            this.j = 0;
            return false;
        }
        this.j = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        int n;
        for (n = 0; n < this.g.size(); ++n) {
            codedOutputStream.writeMessage(1, (MessageLite)this.g.get(n));
        }
        if ((this.f & 1) == 1) {
            codedOutputStream.writeBool(2, this.h);
        }
        for (n = 0; n < this.i.size(); ++n) {
            codedOutputStream.writeMessage(3, (MessageLite)this.i.get(n));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n;
        int n2 = this.memoizedSize;
        if (n2 != -1) {
            return n2;
        }
        n2 = 0;
        for (n = 0; n < this.g.size(); ++n) {
            n2 += CodedOutputStream.computeMessageSize((int)1, (MessageLite)((MessageLite)this.g.get(n)));
        }
        if ((this.f & 1) == 1) {
            n2 += CodedOutputStream.computeBoolSize((int)2, (boolean)this.h);
        }
        for (n = 0; n < this.i.size(); ++n) {
            n2 += CodedOutputStream.computeMessageSize((int)3, (MessageLite)((MessageLite)this.i.get(n)));
        }
        this.memoizedSize = n2 += this.unknownFields.getSerializedSize();
        return n2;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof fc)) {
            return super.equals(object);
        }
        fc fc2 = (fc)object;
        boolean bl = true;
        bl = bl && this.b().equals(fc2.b());
        boolean bl2 = bl = bl && this.e() == fc2.e();
        if (this.e()) {
            bl = bl && this.f() == fc2.f();
        }
        bl = bl && this.g().equals(fc2.g());
        bl = bl && this.unknownFields.equals((Object)fc2.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + fc.a().hashCode();
        if (this.d() > 0) {
            n = 37 * n + 1;
            n = 53 * n + this.b().hashCode();
        }
        if (this.e()) {
            n = 37 * n + 2;
            n = 53 * n + Internal.hashBoolean((boolean)this.f());
        }
        if (this.i() > 0) {
            n = 37 * n + 3;
            n = 53 * n + this.g().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static fc a(ByteBuffer byteBuffer) {
        return (fc)d.parseFrom(byteBuffer);
    }

    public static fc a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (fc)d.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static fc a(ByteString byteString) {
        return (fc)d.parseFrom(byteString);
    }

    public static fc a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (fc)d.parseFrom(byteString, extensionRegistryLite);
    }

    public static fc a(byte[] byArray) {
        return (fc)d.parseFrom(byArray);
    }

    public static fc a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (fc)d.parseFrom(byArray, extensionRegistryLite);
    }

    public static fc a(InputStream inputStream) {
        return (fc)GeneratedMessageV3.parseWithIOException(d, (InputStream)inputStream);
    }

    public static fc a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (fc)GeneratedMessageV3.parseWithIOException(d, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static fc b(InputStream inputStream) {
        return (fc)GeneratedMessageV3.parseDelimitedWithIOException(d, (InputStream)inputStream);
    }

    public static fc b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (fc)GeneratedMessageV3.parseDelimitedWithIOException(d, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static fc a(CodedInputStream codedInputStream) {
        return (fc)GeneratedMessageV3.parseWithIOException(d, (CodedInputStream)codedInputStream);
    }

    public static fc a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (fc)GeneratedMessageV3.parseWithIOException(d, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public fe j() {
        return fc.k();
    }

    public static fe k() {
        return k.l();
    }

    public static fe a(fc fc2) {
        return k.l().a(fc2);
    }

    public fe l() {
        return this == k ? new fe() : new fe().a(this);
    }

    protected fe a(GeneratedMessageV3.BuilderParent builderParent) {
        fe fe2 = new fe(builderParent);
        return fe2;
    }

    public static fc m() {
        return k;
    }

    public static Parser<fc> n() {
        return d;
    }

    public Parser<fc> getParserForType() {
        return d;
    }

    public fc o() {
        return k;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.l();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.j();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.l();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.j();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.o();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.o();
    }

    static /* synthetic */ boolean p() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean q() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean r() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(fc fc2) {
        return fc2.unknownFields;
    }
}

