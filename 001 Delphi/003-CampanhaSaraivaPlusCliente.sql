USE [dbretaguarda]
GO

/****** Object:  Table [dbo].[CampanhaSaraivaPlusCliente]    Script Date: 22/11/2016 10:42:34 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

SET ANSI_PADDING ON
GO

CREATE TABLE [dbo].[CampanhaSaraivaPlusCliente](
	[CSC_ID] [int] IDENTITY(1,1) NOT NULL,
	[CSC_CSP_ID] [int] NOT NULL,
	[CSC_CSP_Sexo] [char](1) NULL,
	[CSC_fgBonusDtCadastro] [char](1) NULL,
	[CSC_fgBonusAniversario] [char](1) NULL,
	[CSC_fgBonusCompraAniversario] [char](1) NULL,
	[CSC_fgBonusEnriquecimento] [char](1) NULL,
	[CSC_FrequenciaCompra] [int] NULL,
 CONSTRAINT [PK_CampanhaSaraivaPlusCliente] PRIMARY KEY CLUSTERED 
(
	[CSC_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO

SET ANSI_PADDING OFF
GO

ALTER TABLE [dbo].[CampanhaSaraivaPlusCliente] ADD  DEFAULT ('N') FOR [CSC_fgBonusDtCadastro]
GO

ALTER TABLE [dbo].[CampanhaSaraivaPlusCliente] ADD  DEFAULT ('N') FOR [CSC_fgBonusAniversario]
GO

ALTER TABLE [dbo].[CampanhaSaraivaPlusCliente] ADD  DEFAULT ('N') FOR [CSC_fgBonusCompraAniversario]
GO

ALTER TABLE [dbo].[CampanhaSaraivaPlusCliente] ADD  DEFAULT ('N') FOR [CSC_fgBonusEnriquecimento]
GO

ALTER TABLE [dbo].[CampanhaSaraivaPlusCliente]  WITH CHECK ADD  CONSTRAINT [FK_CampanhaSaraivaPlusCliente_CampanhaSaraivaPlus] FOREIGN KEY([CSC_CSP_ID])
REFERENCES [dbo].[CampanhaSaraivaPlus] ([CSP_ID])
GO

ALTER TABLE [dbo].[CampanhaSaraivaPlusCliente] CHECK CONSTRAINT [FK_CampanhaSaraivaPlusCliente_CampanhaSaraivaPlus]
GO


