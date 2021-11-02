USE [dbretaguarda]
GO

/****** Object:  Table [dbo].[CampanhaSaraivaPlus]    Script Date: 22/11/2016 10:40:54 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

SET ANSI_PADDING ON
GO

CREATE TABLE [dbo].[CampanhaSaraivaPlus](
	[CSP_ID] [int] IDENTITY(1,1) NOT NULL,
	[CSP_NomeCampanha] [varchar](100) NOT NULL,
	[CSP_fgTipoPontuacao] [char](1) NULL,
	[CSP_QtdePontos] [int] NOT NULL,
	[CSP_Fator] [int] NOT NULL,
	[CSP_DiasCampanha] [int] NOT NULL,
	[CSP_lgAtivo] [char](1) NULL,
	[CSP_dthInicio] [smalldatetime] NOT NULL,
	[CSP_dthFinal] [smalldatetime] NOT NULL,
	[CSP_USU_IdCadastro] [int] NOT NULL,
	[CSP_USU_IdAlteracao] [int] NOT NULL,
	[CSP_dthCadastro] [smalldatetime] NOT NULL,
	[CSP_dthAlteracao] [smalldatetime] NOT NULL,
 CONSTRAINT [PK_CampanhaSaraivaPlus] PRIMARY KEY CLUSTERED 
(
	[CSP_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO

SET ANSI_PADDING OFF
GO

ALTER TABLE [dbo].[CampanhaSaraivaPlus] ADD  DEFAULT ('F') FOR [CSP_fgTipoPontuacao]
GO

ALTER TABLE [dbo].[CampanhaSaraivaPlus] ADD  DEFAULT ('S') FOR [CSP_lgAtivo]
GO


