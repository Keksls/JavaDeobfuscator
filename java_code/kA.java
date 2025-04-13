/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessage$BuilderParent
 *  com.google.protobuf.AbstractMessageLite$Builder
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.Descriptors$FieldDescriptor
 *  com.google.protobuf.Descriptors$OneofDescriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.RepeatedFieldBuilderV3
 *  com.google.protobuf.SingleFieldBuilderV3
 *  com.google.protobuf.UnknownFieldSet
 */
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class kA
extends GeneratedMessageV3.Builder<kA>
implements kB {
    private int a;
    private List<ki> b = Collections.emptyList();
    private RepeatedFieldBuilderV3<ki, kk, kl> c;
    private km_0 d = null;
    private SingleFieldBuilderV3<km_0, ko_0, kx_0> e;

    public static final Descriptors.Descriptor a() {
        return kg.a;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return kg.b.ensureFieldAccessorsInitialized(ky_0.class, kA.class);
    }

    kA() {
        this.r();
    }

    kA(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.r();
    }

    private void r() {
        if (ky_0.n()) {
            this.t();
            this.u();
        }
    }

    public kA h() {
        super.clear();
        if (this.c == null) {
            this.b = Collections.emptyList();
            this.a &= 0xFFFFFFFE;
        } else {
            this.c.clear();
        }
        if (this.e == null) {
            this.d = null;
        } else {
            this.e.clear();
        }
        this.a &= 0xFFFFFFFD;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return kg.a;
    }

    public ky_0 i() {
        return ky_0.k();
    }

    public ky_0 j() {
        ky_0 ky_02 = this.k();
        if (!ky_02.isInitialized()) {
            throw kA.newUninitializedMessageException((Message)ky_02);
        }
        return ky_02;
    }

    public ky_0 k() {
        ky_0 ky_02 = new ky_0(this);
        int n = this.a;
        int n2 = 0;
        if (this.c == null) {
            if ((this.a & 1) == 1) {
                this.b = Collections.unmodifiableList(this.b);
                this.a &= 0xFFFFFFFE;
            }
            ky_02.f = this.b;
        } else {
            ky_02.f = this.c.build();
        }
        if ((n & 2) == 2) {
            n2 |= 1;
        }
        ky_02.g = this.e == null ? this.d : (km_0)this.e.build();
        ky_02.e = n2;
        this.onBuilt();
        return ky_02;
    }

    public kA l() {
        return (kA)super.clone();
    }

    public kA a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (kA)super.setField(fieldDescriptor, object);
    }

    public kA a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (kA)super.clearField(fieldDescriptor);
    }

    public kA a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (kA)super.clearOneof(oneofDescriptor);
    }

    public kA a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (kA)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public kA b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (kA)super.addRepeatedField(fieldDescriptor, object);
    }

    public kA a(Message message) {
        if (message instanceof ky_0) {
            return this.a((ky_0)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public kA a(ky_0 ky_02) {
        if (ky_02 == ky_0.k()) {
            return this;
        }
        if (this.c == null) {
            if (!ky_02.f.isEmpty()) {
                if (this.b.isEmpty()) {
                    this.b = ky_02.f;
                    this.a &= 0xFFFFFFFE;
                } else {
                    this.s();
                    this.b.addAll(ky_02.f);
                }
                this.onChanged();
            }
        } else if (!ky_02.f.isEmpty()) {
            if (this.c.isEmpty()) {
                this.c.dispose();
                this.c = null;
                this.b = ky_02.f;
                this.a &= 0xFFFFFFFE;
                this.c = ky_0.o() ? this.t() : null;
            } else {
                this.c.addAllMessages(ky_02.f);
            }
        }
        if (ky_02.e()) {
            this.b(ky_02.f());
        }
        this.b(ky_0.b(ky_02));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.e()) {
            return false;
        }
        for (int k = 0; k < this.d(); ++k) {
            if (this.a(k).isInitialized()) continue;
            return false;
        }
        return this.f().isInitialized();
    }

    public kA a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        ky_0 ky_02 = null;
        try {
            ky_02 = (ky_0)ky_0.c.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            ky_02 = (ky_0)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (ky_02 != null) {
                this.a(ky_02);
            }
        }
        return this;
    }

    private void s() {
        if ((this.a & 1) != 1) {
            this.b = new ArrayList<ki>(this.b);
            this.a |= 1;
        }
    }

    @Override
    public List<ki> b() {
        if (this.c == null) {
            return Collections.unmodifiableList(this.b);
        }
        return this.c.getMessageList();
    }

    @Override
    public int d() {
        if (this.c == null) {
            return this.b.size();
        }
        return this.c.getCount();
    }

    @Override
    public ki a(int n) {
        if (this.c == null) {
            return this.b.get(n);
        }
        return (ki)this.c.getMessage(n);
    }

    public kA a(int n, ki ki2) {
        if (this.c == null) {
            if (ki2 == null) {
                throw new NullPointerException();
            }
            this.s();
            this.b.set(n, ki2);
            this.onChanged();
        } else {
            this.c.setMessage(n, (AbstractMessage)ki2);
        }
        return this;
    }

    public kA a(int n, kk kk2) {
        if (this.c == null) {
            this.s();
            this.b.set(n, kk2.m());
            this.onChanged();
        } else {
            this.c.setMessage(n, (AbstractMessage)kk2.m());
        }
        return this;
    }

    public kA a(ki ki2) {
        if (this.c == null) {
            if (ki2 == null) {
                throw new NullPointerException();
            }
            this.s();
            this.b.add(ki2);
            this.onChanged();
        } else {
            this.c.addMessage((AbstractMessage)ki2);
        }
        return this;
    }

    public kA b(int n, ki ki2) {
        if (this.c == null) {
            if (ki2 == null) {
                throw new NullPointerException();
            }
            this.s();
            this.b.add(n, ki2);
            this.onChanged();
        } else {
            this.c.addMessage(n, (AbstractMessage)ki2);
        }
        return this;
    }

    public kA a(kk kk2) {
        if (this.c == null) {
            this.s();
            this.b.add(kk2.m());
            this.onChanged();
        } else {
            this.c.addMessage((AbstractMessage)kk2.m());
        }
        return this;
    }

    public kA b(int n, kk kk2) {
        if (this.c == null) {
            this.s();
            this.b.add(n, kk2.m());
            this.onChanged();
        } else {
            this.c.addMessage(n, (AbstractMessage)kk2.m());
        }
        return this;
    }

    public kA a(Iterable<? extends ki> iterable) {
        if (this.c == null) {
            this.s();
            AbstractMessageLite.Builder.addAll(iterable, this.b);
            this.onChanged();
        } else {
            this.c.addAllMessages(iterable);
        }
        return this;
    }

    public kA m() {
        if (this.c == null) {
            this.b = Collections.emptyList();
            this.a &= 0xFFFFFFFE;
            this.onChanged();
        } else {
            this.c.clear();
        }
        return this;
    }

    public kA c(int n) {
        if (this.c == null) {
            this.s();
            this.b.remove(n);
            this.onChanged();
        } else {
            this.c.remove(n);
        }
        return this;
    }

    public kk d(int n) {
        return (kk)this.t().getBuilder(n);
    }

    @Override
    public kl b(int n) {
        if (this.c == null) {
            return this.b.get(n);
        }
        return (kl)this.c.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends kl> c() {
        if (this.c != null) {
            return this.c.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.b);
    }

    public kk n() {
        return (kk)this.t().addBuilder((AbstractMessage)ki.n());
    }

    public kk e(int n) {
        return (kk)this.t().addBuilder(n, (AbstractMessage)ki.n());
    }

    public List<kk> o() {
        return this.t().getBuilderList();
    }

    private RepeatedFieldBuilderV3<ki, kk, kl> t() {
        if (this.c == null) {
            this.c = new RepeatedFieldBuilderV3(this.b, (this.a & 1) == 1, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.b = null;
        }
        return this.c;
    }

    @Override
    public boolean e() {
        return (this.a & 2) == 2;
    }

    @Override
    public km_0 f() {
        if (this.e == null) {
            return this.d == null ? km_0.k() : this.d;
        }
        return (km_0)this.e.getMessage();
    }

    public kA a(km_0 km_02) {
        if (this.e == null) {
            if (km_02 == null) {
                throw new NullPointerException();
            }
            this.d = km_02;
            this.onChanged();
        } else {
            this.e.setMessage((AbstractMessage)km_02);
        }
        this.a |= 2;
        return this;
    }

    public kA a(ko_0 ko_02) {
        if (this.e == null) {
            this.d = ko_02.j();
            this.onChanged();
        } else {
            this.e.setMessage((AbstractMessage)ko_02.j());
        }
        this.a |= 2;
        return this;
    }

    public kA b(km_0 km_02) {
        if (this.e == null) {
            this.d = (this.a & 2) == 2 && this.d != null && this.d != km_0.k() ? km_0.a(this.d).a(km_02).k() : km_02;
            this.onChanged();
        } else {
            this.e.mergeFrom((AbstractMessage)km_02);
        }
        this.a |= 2;
        return this;
    }

    public kA p() {
        if (this.e == null) {
            this.d = null;
            this.onChanged();
        } else {
            this.e.clear();
        }
        this.a &= 0xFFFFFFFD;
        return this;
    }

    public ko_0 q() {
        this.a |= 2;
        this.onChanged();
        return (ko_0)this.u().getBuilder();
    }

    @Override
    public kx_0 g() {
        if (this.e != null) {
            return (kx_0)this.e.getMessageOrBuilder();
        }
        return this.d == null ? km_0.k() : this.d;
    }

    private SingleFieldBuilderV3<km_0, ko_0, kx_0> u() {
        if (this.e == null) {
            this.e = new SingleFieldBuilderV3((AbstractMessage)this.f(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.d = null;
        }
        return this.e;
    }

    public final kA a(UnknownFieldSet unknownFieldSet) {
        return (kA)super.setUnknownFields(unknownFieldSet);
    }

    public final kA b(UnknownFieldSet unknownFieldSet) {
        return (kA)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.b(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.a(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.b(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.a(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.a(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.a(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.h();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.l();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.b(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.h();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.l();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.b(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.a(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.b(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.a(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.a(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.a(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.l();
    }

    public /* synthetic */ Message buildPartial() {
        return this.k();
    }

    public /* synthetic */ Message build() {
        return this.j();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.h();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.l();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.k();
    }

    public /* synthetic */ MessageLite build() {
        return this.j();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.h();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.i();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.i();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.l();
    }

    public /* synthetic */ Object clone() {
        return this.l();
    }
}

