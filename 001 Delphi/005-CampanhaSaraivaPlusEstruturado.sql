USE [dbretaguarda]
GO

/****** Object:  Table [dbo].[CampanhaSaraivaPlusEstruturado]    Script Date: 22/11/2016 10:43:29 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

SET ANSI_PADDING ON
GO

CREATE TABLE [dbo].[CampanhaSaraivaPlusEstruturado](
	[CST_ID] [int] IDENTITY(1,1) NOT NULL,
	[CST_EST_CDEstruturado] [varchar](20) NOT NULL,
	[CST_CSP_ID] [int] NOT NULL,
	[CST_Qtde] [int] NOT NULL,
 CONSTRAINT [PK_CampanhaSaraivaPlusEstruturado] PRIMARY KEY CLUSTERED 
(
	[CST_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO

SET ANSI_PADDING OFF
GO

ALTER TABLE [dbo].[CampanhaSaraivaPlusEstruturado]  WITH CHECK ADD  CONSTRAINT [FK_CampanhaSaraivaPlusEstruturado_CampanhaSaraivaPlus] FOREIGN KEY([CST_CSP_ID])
REFERENCES [dbo].[CampanhaSaraivaPlus] ([CSP_ID])
GO

ALTER TABLE [dbo].[CampanhaSaraivaPlusEstruturado] CHECK CONSTRAINT [FK_CampanhaSaraivaPlusEstruturado_CampanhaSaraivaPlus]
GO

ALTER TABLE [dbo].[CampanhaSaraivaPlusEstruturado]  WITH CHECK ADD  CONSTRAINT [FK_CampanhaSaraivaPlusEstruturado_Estruturado] FOREIGN KEY([CST_EST_CDEstruturado])
REFERENCES [dbo].[Estruturado] ([EST_CdEstruturado])
GO

ALTER TABLE [dbo].[CampanhaSaraivaPlusEstruturado] CHECK CONSTRAINT [FK_CampanhaSaraivaPlusEstruturado_Estruturado]
GO


