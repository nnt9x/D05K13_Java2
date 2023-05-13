package design_pattern.builder3;

public class Order {
    private int traDa;
    private int banhMi20k;
    private int pho;
    private int bun;
    private int coCa;
    private int caphe;
    private int xoi;
    private int kem;

    private int traSua;
    private int chao;

    private Order(int traDa, int banhMi20k, int pho, int bun, int coCa, int caphe, int xoi, int kem, int traSua, int chao) {
        this.traDa = traDa;
        this.banhMi20k = banhMi20k;
        this.pho = pho;
        this.bun = bun;
        this.coCa = coCa;
        this.caphe = caphe;
        this.xoi = xoi;
        this.kem = kem;
        this.traSua = traSua;
        this.chao = chao;
    }

    public int getTraDa() {
        return traDa;
    }

    public void setTraDa(int traDa) {
        this.traDa = traDa;
    }

    public int getBanhMi20k() {
        return banhMi20k;
    }

    public void setBanhMi20k(int banhMi20k) {
        this.banhMi20k = banhMi20k;
    }

    public int getPho() {
        return pho;
    }

    public void setPho(int pho) {
        this.pho = pho;
    }

    public int getBun() {
        return bun;
    }

    public void setBun(int bun) {
        this.bun = bun;
    }

    public int getCoCa() {
        return coCa;
    }

    public void setCoCa(int coCa) {
        this.coCa = coCa;
    }

    public int getCaphe() {
        return caphe;
    }

    public void setCaphe(int caphe) {
        this.caphe = caphe;
    }

    public int getXoi() {
        return xoi;
    }

    public void setXoi(int xoi) {
        this.xoi = xoi;
    }

    public int getKem() {
        return kem;
    }

    public void setKem(int kem) {
        this.kem = kem;
    }

    public int getTraSua() {
        return traSua;
    }

    public void setTraSua(int traSua) {
        this.traSua = traSua;
    }

    public int getChao() {
        return chao;
    }

    public void setChao(int chao) {
        this.chao = chao;
    }

    public void printOrder() {
        StringBuilder sb = new StringBuilder();
        sb.append("---- D05K13 Store ----\n");
        if(traDa > 0) {
            sb.append("Tra da: " + traDa + "\n");
        }
        if(banhMi20k > 0) {
            sb.append("Banh mi 20k: " + banhMi20k + "\n");
        }
        if(pho > 0) {
            sb.append("Pho: " + pho + "\n");
        }
        if(bun > 0) {
            sb.append("Bun: " + bun + "\n");
        }
        if(coCa > 0) {
            sb.append("Co ca: " + coCa + "\n");
        }
        if(caphe > 0) {
            sb.append("Caphe: " + caphe + "\n");
        }
        if(xoi > 0) {
            sb.append("Xoi: " + xoi + "\n");
        }
        if(kem > 0) {
            sb.append("Kem: " + kem + "\n");
        }
        if(traSua > 0) {
            sb.append("Tra sua: " + traSua + "\n");
        }
        if(chao > 0) {
            sb.append("Chao: " + chao + "\n");
        }
        System.out.println(sb.toString());
    }



    static class Builder {
        private int traDa = 0;
        private int banhMi20k = 0;
        private int pho = 0;
        private int bun = 0;
        private int coCa = 0;
        private int caphe = 0;
        private int xoi = 0;
        private int kem = 0;

        private int traSua = 0;
        private int chao = 0;

        public Builder() {
        }

        public Builder traDa(int traDa) {
            this.traDa = traDa;
            return this;
        }

        public Builder banhMi20k(int banhMi20k) {
            this.banhMi20k = banhMi20k;
            return this;
        }

        public Builder pho(int pho) {
            this.pho = pho;
            return this;
        }

        public Builder bun(int bun) {
            this.bun = bun;
            return this;
        }

        public Builder coCa(int coCa) {
            this.coCa = coCa;
            return this;
        }

        public Builder caphe(int caphe) {
            this.caphe = caphe;
            return this;
        }

        public Builder xoi(int xoi) {
            this.xoi = xoi;
            return this;
        }

        public Builder kem(int kem) {
            this.kem = kem;
            return this;
        }

        public Builder traSua(int traSua) {
            this.traSua = traSua;
            return this;
        }

        public Order create() {
            return new Order(traDa, banhMi20k, pho, bun, coCa, caphe, xoi, kem, traSua, chao);
        }

    }


}
