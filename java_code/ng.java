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

public final class ng
extends GeneratedMessageV3.Builder<ng>
implements nh {
    private int a;
    private mu b = null;
    private SingleFieldBuilderV3<mu, mw, mx_0> c;
    private List<na> d = Collections.emptyList();
    private RepeatedFieldBuilderV3<na, nc, nd> e;

    public static final Descriptors.Descriptor a() {
        return mY.a;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return mY.b.ensureFieldAccessorsInitialized(ne.class, ng.class);
    }

    ng() {
        this.r();
    }

    ng(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.r();
    }

    private void r() {
        if (ne.n()) {
            this.s();
            this.u();
        }
    }

    public ng h() {
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
        return mY.a;
    }

    public ne i() {
        return ne.k();
    }

    public ne j() {
        ne ne2 = this.k();
        if (!ne2.isInitialized()) {
            throw ng.newUninitializedMessageException((Message)ne2);
        }
        return ne2;
    }

    public ne k() {
        ne ne2 = new ne(this);
        int n = this.a;
        int n2 = 0;
        if ((n & 1) == 1) {
            n2 |= 1;
        }
        ne2.f = this.c == null ? this.b : (mu)this.c.build();
        if (this.e == null) {
            if ((this.a & 2) == 2) {
                this.d = Collections.unmodifiableList(this.d);
                this.a &= 0xFFFFFFFD;
            }
            ne2.g = this.d;
        } else {
            ne2.g = this.e.build();
        }
        ne2.e = n2;
        this.onBuilt();
        return ne2;
    }

    public ng l() {
        return (ng)super.clone();
    }

    public ng a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ng)super.setField(fieldDescriptor, object);
    }

    public ng a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (ng)super.clearField(fieldDescriptor);
    }

    public ng a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (ng)super.clearOneof(oneofDescriptor);
    }

    public ng a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (ng)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public ng b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ng)super.addRepeatedField(fieldDescriptor, object);
    }

    public ng a(Message message) {
        if (message instanceof ne) {
            return this.a((ne)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public ng a(ne ne2) {
        if (ne2 == ne.k()) {
            return this;
        }
        if (ne2.b()) {
            this.b(ne2.c());
        }
        if (this.e == null) {
            if (!ne2.g.isEmpty()) {
                if (this.d.isEmpty()) {
                    this.d = ne2.g;
                    this.a &= 0xFFFFFFFD;
                } else {
                    this.t();
                    this.d.addAll(ne2.g);
                }
                this.onChanged();
            }
        } else if (!ne2.g.isEmpty()) {
            if (this.e.isEmpty()) {
                this.e.dispose();
                this.e = null;
                this.d = ne2.g;
                this.a &= 0xFFFFFFFD;
                this.e = ne.o() ? this.u() : null;
            } else {
                this.e.addAllMessages(ne2.g);
            }
        }
        this.b(ne.b(ne2));
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

    public ng a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        ne ne2 = null;
        try {
            ne2 = (ne)ne.c.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            ne2 = (ne)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (ne2 != null) {
                this.a(ne2);
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

    public ng a(mu mu2) {
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

    public ng a(mw mw2) {
        if (this.c == null) {
            this.b = mw2.j();
            this.onChanged();
        } else {
            this.c.setMessage((AbstractMessage)mw2.j());
        }
        this.a |= 1;
        return this;
    }

    public ng b(mu mu2) {
        if (this.c == null) {
            this.b = (this.a & 1) == 1 && this.b != null && this.b != mu.k() ? mu.a(this.b).a(mu2).k() : mu2;
            this.onChanged();
        } else {
            this.c.mergeFrom((AbstractMessage)mu2);
        }
        this.a |= 1;
        return this;
    }

    public ng m() {
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
            this.d = new ArrayList<na>(this.d);
            this.a |= 2;
        }
    }

    @Override
    public List<na> e() {
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
    public na a(int n) {
        if (this.e == null) {
            return this.d.get(n);
        }
        return (na)this.e.getMessage(n);
    }

    public ng a(int n, na na2) {
        if (this.e == null) {
            if (na2 == null) {
                throw new NullPointerException();
            }
            this.t();
            this.d.set(n, na2);
            this.onChanged();
        } else {
            this.e.setMessage(n, (AbstractMessage)na2);
        }
        return this;
    }

    public ng a(int n, nc nc2) {
        if (this.e == null) {
            this.t();
            this.d.set(n, nc2.q());
            this.onChanged();
        } else {
            this.e.setMessage(n, (AbstractMessage)nc2.q());
        }
        return this;
    }

    public ng a(na na2) {
        if (this.e == null) {
            if (na2 == null) {
                throw new NullPointerException();
            }
            this.t();
            this.d.add(na2);
            this.onChanged();
        } else {
            this.e.addMessage((AbstractMessage)na2);
        }
        return this;
    }

    public ng b(int n, na na2) {
        if (this.e == null) {
            if (na2 == null) {
                throw new NullPointerException();
            }
            this.t();
            this.d.add(n, na2);
            this.onChanged();
        } else {
            this.e.addMessage(n, (AbstractMessage)na2);
        }
        return this;
    }

    public ng a(nc nc2) {
        if (this.e == null) {
            this.t();
            this.d.add(nc2.q());
            this.onChanged();
        } else {
            this.e.addMessage((AbstractMessage)nc2.q());
        }
        return this;
    }

    public ng b(int n, nc nc2) {
        if (this.e == null) {
            this.t();
            this.d.add(n, nc2.q());
            this.onChanged();
        } else {
            this.e.addMessage(n, (AbstractMessage)nc2.q());
        }
        return this;
    }

    public ng a(Iterable<? extends na> iterable) {
        if (this.e == null) {
            this.t();
            AbstractMessageLite.Builder.addAll(iterable, this.d);
            this.onChanged();
        } else {
            this.e.addAllMessages(iterable);
        }
        return this;
    }

    public ng o() {
        if (this.e == null) {
            this.d = Collections.emptyList();
            this.a &= 0xFFFFFFFD;
            this.onChanged();
        } else {
            this.e.clear();
        }
        return this;
    }

    public ng c(int n) {
        if (this.e == null) {
            this.t();
            this.d.remove(n);
            this.onChanged();
        } else {
            this.e.remove(n);
        }
        return this;
    }

    public nc d(int n) {
        return (nc)this.u().getBuilder(n);
    }

    @Override
    public nd b(int n) {
        if (this.e == null) {
            return this.d.get(n);
        }
        return (nd)this.e.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends nd> f() {
        if (this.e != null) {
            return this.e.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.d);
    }

    public nc p() {
        return (nc)this.u().addBuilder((AbstractMessage)na.r());
    }

    public nc e(int n) {
        return (nc)this.u().addBuilder(n, (AbstractMessage)na.r());
    }

    public List<nc> q() {
        return this.u().getBuilderList();
    }

    private RepeatedFieldBuilderV3<na, nc, nd> u() {
        if (this.e == null) {
            this.e = new RepeatedFieldBuilderV3(this.d, (this.a & 2) == 2, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.d = null;
        }
        return this.e;
    }

    public final ng a(UnknownFieldSet unknownFieldSet) {
        return (ng)super.setUnknownFields(unknownFieldSet);
    }

    public final ng b(UnknownFieldSet unknownFieldSet) {
        return (ng)super.mergeUnknownFields(unknownFieldSet);
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

