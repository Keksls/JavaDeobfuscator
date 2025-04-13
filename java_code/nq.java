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

public final class nq
extends GeneratedMessageV3.Builder<nq>
implements nr {
    private int a;
    private mu b = null;
    private SingleFieldBuilderV3<mu, mw, mx_0> c;
    private List<nk> d = Collections.emptyList();
    private RepeatedFieldBuilderV3<nk, nm, nn> e;

    public static final Descriptors.Descriptor a() {
        return ni.a;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ni.b.ensureFieldAccessorsInitialized(no.class, nq.class);
    }

    nq() {
        this.r();
    }

    nq(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.r();
    }

    private void r() {
        if (no.n()) {
            this.s();
            this.u();
        }
    }

    public nq h() {
        super.clear();
        if (this.c == null) {
            this.b = null;
        } else {
            this.c.clear();
        }
        this.a &= 0xFFFFFFFE;
        if (this.e == null) {
            this.d = Collections.emptyList();
            this.a &= 0xFFFFFFFD;
        } else {
            this.e.clear();
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ni.a;
    }

    public no i() {
        return no.k();
    }

    public no j() {
        no no2 = this.k();
        if (!no2.isInitialized()) {
            throw nq.newUninitializedMessageException((Message)no2);
        }
        return no2;
    }

    public no k() {
        no no2 = new no(this);
        int n = this.a;
        int n2 = 0;
        if ((n & 1) == 1) {
            n2 |= 1;
        }
        no2.f = this.c == null ? this.b : (mu)this.c.build();
        if (this.e == null) {
            if ((this.a & 2) == 2) {
                this.d = Collections.unmodifiableList(this.d);
                this.a &= 0xFFFFFFFD;
            }
            no2.g = this.d;
        } else {
            no2.g = this.e.build();
        }
        no2.e = n2;
        this.onBuilt();
        return no2;
    }

    public nq l() {
        return (nq)super.clone();
    }

    public nq a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (nq)super.setField(fieldDescriptor, object);
    }

    public nq a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (nq)super.clearField(fieldDescriptor);
    }

    public nq a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (nq)super.clearOneof(oneofDescriptor);
    }

    public nq a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (nq)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public nq b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (nq)super.addRepeatedField(fieldDescriptor, object);
    }

    public nq a(Message message) {
        if (message instanceof no) {
            return this.a((no)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public nq a(no no2) {
        if (no2 == no.k()) {
            return this;
        }
        if (no2.b()) {
            this.b(no2.c());
        }
        if (this.e == null) {
            if (!no2.g.isEmpty()) {
                if (this.d.isEmpty()) {
                    this.d = no2.g;
                    this.a &= 0xFFFFFFFD;
                } else {
                    this.t();
                    this.d.addAll(no2.g);
                }
                this.onChanged();
            }
        } else if (!no2.g.isEmpty()) {
            if (this.e.isEmpty()) {
                this.e.dispose();
                this.e = null;
                this.d = no2.g;
                this.a &= 0xFFFFFFFD;
                this.e = no.o() ? this.u() : null;
            } else {
                this.e.addAllMessages(no2.g);
            }
        }
        this.b(no.b(no2));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.b()) {
            return false;
        }
        if (!this.c().isInitialized()) {
            return false;
        }
        for (int k = 0; k < this.g(); ++k) {
            if (this.a(k).isInitialized()) continue;
            return false;
        }
        return true;
    }

    public nq a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        no no2 = null;
        try {
            no2 = (no)no.c.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            no2 = (no)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (no2 != null) {
                this.a(no2);
            }
        }
        return this;
    }

    @Override
    public boolean b() {
        return (this.a & 1) == 1;
    }

    @Override
    public mu c() {
        if (this.c == null) {
            return this.b == null ? mu.k() : this.b;
        }
        return (mu)this.c.getMessage();
    }

    public nq a(mu mu2) {
        if (this.c == null) {
            if (mu2 == null) {
                throw new NullPointerException();
            }
            this.b = mu2;
            this.onChanged();
        } else {
            this.c.setMessage((AbstractMessage)mu2);
        }
        this.a |= 1;
        return this;
    }

    public nq a(mw mw2) {
        if (this.c == null) {
            this.b = mw2.j();
            this.onChanged();
        } else {
            this.c.setMessage((AbstractMessage)mw2.j());
        }
        this.a |= 1;
        return this;
    }

    public nq b(mu mu2) {
        if (this.c == null) {
            this.b = (this.a & 1) == 1 && this.b != null && this.b != mu.k() ? mu.a(this.b).a(mu2).k() : mu2;
            this.onChanged();
        } else {
            this.c.mergeFrom((AbstractMessage)mu2);
        }
        this.a |= 1;
        return this;
    }

    public nq m() {
        if (this.c == null) {
            this.b = null;
            this.onChanged();
        } else {
            this.c.clear();
        }
        this.a &= 0xFFFFFFFE;
        return this;
    }

    public mw n() {
        this.a |= 1;
        this.onChanged();
        return (mw)this.s().getBuilder();
    }

    @Override
    public mx_0 d() {
        if (this.c != null) {
            return (mx_0)this.c.getMessageOrBuilder();
        }
        return this.b == null ? mu.k() : this.b;
    }

    private SingleFieldBuilderV3<mu, mw, mx_0> s() {
        if (this.c == null) {
            this.c = new SingleFieldBuilderV3((AbstractMessage)this.c(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.b = null;
        }
        return this.c;
    }

    private void t() {
        if ((this.a & 2) != 2) {
            this.d = new ArrayList<nk>(this.d);
            this.a |= 2;
        }
    }

    @Override
    public List<nk> e() {
        if (this.e == null) {
            return Collections.unmodifiableList(this.d);
        }
        return this.e.getMessageList();
    }

    @Override
    public int g() {
        if (this.e == null) {
            return this.d.size();
        }
        return this.e.getCount();
    }

    @Override
    public nk a(int n) {
        if (this.e == null) {
            return this.d.get(n);
        }
        return (nk)this.e.getMessage(n);
    }

    public nq a(int n, nk nk2) {
        if (this.e == null) {
            if (nk2 == null) {
                throw new NullPointerException();
            }
            this.t();
            this.d.set(n, nk2);
            this.onChanged();
        } else {
            this.e.setMessage(n, (AbstractMessage)nk2);
        }
        return this;
    }

    public nq a(int n, nm nm2) {
        if (this.e == null) {
            this.t();
            this.d.set(n, nm2.o());
            this.onChanged();
        } else {
            this.e.setMessage(n, (AbstractMessage)nm2.o());
        }
        return this;
    }

    public nq a(nk nk2) {
        if (this.e == null) {
            if (nk2 == null) {
                throw new NullPointerException();
            }
            this.t();
            this.d.add(nk2);
            this.onChanged();
        } else {
            this.e.addMessage((AbstractMessage)nk2);
        }
        return this;
    }

    public nq b(int n, nk nk2) {
        if (this.e == null) {
            if (nk2 == null) {
                throw new NullPointerException();
            }
            this.t();
            this.d.add(n, nk2);
            this.onChanged();
        } else {
            this.e.addMessage(n, (AbstractMessage)nk2);
        }
        return this;
    }

    public nq a(nm nm2) {
        if (this.e == null) {
            this.t();
            this.d.add(nm2.o());
            this.onChanged();
        } else {
            this.e.addMessage((AbstractMessage)nm2.o());
        }
        return this;
    }

    public nq b(int n, nm nm2) {
        if (this.e == null) {
            this.t();
            this.d.add(n, nm2.o());
            this.onChanged();
        } else {
            this.e.addMessage(n, (AbstractMessage)nm2.o());
        }
        return this;
    }

    public nq a(Iterable<? extends nk> iterable) {
        if (this.e == null) {
            this.t();
            AbstractMessageLite.Builder.addAll(iterable, this.d);
            this.onChanged();
        } else {
            this.e.addAllMessages(iterable);
        }
        return this;
    }

    public nq o() {
        if (this.e == null) {
            this.d = Collections.emptyList();
            this.a &= 0xFFFFFFFD;
            this.onChanged();
        } else {
            this.e.clear();
        }
        return this;
    }

    public nq c(int n) {
        if (this.e == null) {
            this.t();
            this.d.remove(n);
            this.onChanged();
        } else {
            this.e.remove(n);
        }
        return this;
    }

    public nm d(int n) {
        return (nm)this.u().getBuilder(n);
    }

    @Override
    public nn b(int n) {
        if (this.e == null) {
            return this.d.get(n);
        }
        return (nn)this.e.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends nn> f() {
        if (this.e != null) {
            return this.e.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.d);
    }

    public nm p() {
        return (nm)this.u().addBuilder((AbstractMessage)nk.p());
    }

    public nm e(int n) {
        return (nm)this.u().addBuilder(n, (AbstractMessage)nk.p());
    }

    public List<nm> q() {
        return this.u().getBuilderList();
    }

    private RepeatedFieldBuilderV3<nk, nm, nn> u() {
        if (this.e == null) {
            this.e = new RepeatedFieldBuilderV3(this.d, (this.a & 2) == 2, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.d = null;
        }
        return this.e;
    }

    public final nq a(UnknownFieldSet unknownFieldSet) {
        return (nq)super.setUnknownFields(unknownFieldSet);
    }

    public final nq b(UnknownFieldSet unknownFieldSet) {
        return (nq)super.mergeUnknownFields(unknownFieldSet);
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

